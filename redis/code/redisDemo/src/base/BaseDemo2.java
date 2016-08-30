package base;

import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

public class BaseDemo2 {
	
	//一次执行一批redis命令
	@Test
	public void testPipeline(){
		Jedis redis = new Jedis("127.0.0.1", 6379);
		Pipeline p = redis.pipelined();
		p.set("employee.name", "liuchuanwei");
		p.sadd("employee.books", "java");	//添加无序集合元素
		p.sadd("employee.books", "mysql");
		p.sadd("employee.books", "php");
		Response<String> name = p.get("employee.name");
		Response<Set<String>> res_books = p.smembers("employee.books");	//获取无序集合中的所有元素
		p.sync();
		
		Set<String> books = res_books.get();
		System.out.println("employee.name : " + name);
		System.out.println("employee.books : " + books);
	}
	
	//事务
	@Test
	public void testTransactions(){
		Jedis redis = new Jedis("127.0.0.1", 6379);
		
		Transaction t = redis.multi();	//开启事务
		Response<String> name = t.get("employee.name");
		t.sadd("employee.books", "福尔摩斯探案全集");
		Response<Set<String>> books = t.smembers("employee.books");
		t.exec();					//提交事务
		
		System.out.println("exec之后的name : " + name);
		System.out.println("exec之后的books : " + books.get());
	}
	//发布订阅
	@Test
	public void testPubSub(){
		
	}
}

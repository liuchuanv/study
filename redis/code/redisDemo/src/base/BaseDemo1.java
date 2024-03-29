package base;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.Jedis;

/**
 * 与其在这里test，不如直接用redis-cli练习，一通百通
 * @author liuc
 * @date 2016年8月3日
 */
public class BaseDemo1 {
	//测试连接
	@Test
	public  void testConn(){
		//连接到本地的 redis 服务
		Jedis redis = new Jedis("127.0.0.1");
//		redis.auth("123456");	//验证密码
		//查看服务是否正常运行
		System.out.println("Redis Server is running: " + redis.ping());
	}
	@Test
	public  void testStoreString(){
		Jedis redis = new Jedis("127.0.0.1");
		//设置 redis 字符串数据
		redis.set("name", "lhat");
		//获取存储的数据并输出
		System.out.println("Stored string in redis:: " + redis.get("name"));
	}
	@Test
	public  void testStoreList(){
		Jedis redis = new Jedis("127.0.0.1");
		
		//存储数据到列表中
		redis.lpush("demo-list", "redis");
		redis.lpush("demo-list", "java");
		redis.lpush("demo-list", "study");
		
		//变量存储的数据并输出
		List<String> list = redis.lrange("demo-list", 0, 10);
		System.out.println("Stored list in redis:: " + list );
	}
	
	//获取存储在 redis 中的所有key
	public  void testGetAllKeys(){
		Jedis redis = new Jedis("127.0.0.1");
		
		Set<String> allKeys = redis.keys("*");
		for(String key : allKeys ){
			System.out.println("Store Key in redis:: " + key);
		}
	}
	
}

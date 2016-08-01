package base;

import redis.clients.jedis.Jedis;

public class BaseDemo1 {
	public static void main(String[] args){
		testConn();
		System.out.println("------------------------");
		testStoreString();
	}
	//测试连接
	public static void testConn(){
		//连接到本地的 redis 服务
		Jedis redis = new Jedis("127.0.0.1");
		
		//查看服务是否正常运行
		System.out.println("Redis Server is running: " + redis.ping());
	}
	
	public static void testStoreString(){
		Jedis redis = new Jedis("127.0.0.1");
		
		//设置 redis 字符串数据
		redis.set("name", "lhat");
		//获取存储的数据并输出
		System.out.println("Stored string in redis:: " + redis.get("name"));
	}
	public static void testStoreList(){
		Jedis redis = new Jedis("127.0.0.1");
		
		//存储数据到列表中
		redis.lpush("demo-list", "redis");
		redis.lpush("demo-list", "java");
		redis.lpush("demo-list", "study");
		
		//变量存储的数据并输出
		List<String> list = redis.lrange("demo-list", 0, 10);
		
	}
}

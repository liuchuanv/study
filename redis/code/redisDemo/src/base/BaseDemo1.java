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
}

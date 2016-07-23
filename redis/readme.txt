
redis的使用

【首先要在电脑上安装redis的server端】
1. 	在 https://github.com/MSOpenTech/redis 或 当前目录下 或其他地方 下载redis的server程序。

2. 	redis中几个exe程序的功能，
	* reids-server.exe 		服务端
	* redis-cli.exe			客户端
	* redis-check-dump.exe	本地数据库检查
	
3. 	将redis的路径添加到系统变量path中，以便在其他目录也能使用redis命令
	
4. 	启动redis服务，打开cmd窗口，输入 redis-server ，出现一个"玄妙"的图案...表示成功了。

5. 	弄一份配置文件 redis.conf 或 redis.windows.conf 到redis目录下，
	打开cmd窗口输入 redis-server.exe E:\server\redis\redis.windows.conf （配置文件目录视情况而定）

6. 	测试，另外在打开一个cmd窗口，输入 redis-cli -h 127.0.0.1 -p 6379 回车，
	再设置一个键值对 set key01 value01，获取键值对 get key01


【在java中使用redis】

1. 	http://www.tutorialspoint.com/redis/redis_java.htm 下载 redis.x.x.jar包，并导入java项目中
	注意：要下载jar包，不要redis.x.x.source.jar包，在下载地址中去掉source即可下载redis.x.x.jar包

2. 去http://www.tutorialspoint.com/redis/redis_java.htm看具体使用方法

	

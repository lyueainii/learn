package redis;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisTest {

	public static void main(String[] args) {
		  //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost",6379);
      //  Jedis jedis = new Jedis(constr) ;
       // jedis.auth("redis");//设置密码

        //jedis.auth("redis");//连接密码
        System.out.println("连接成功");
        //设置 redis 字符串数据
        //jedis.set("runoobkey", "www.runoob.com");
        // 获取存储的数据并输出
     /*   System.out.println("redis 存储的字符串为: "+ jedis.get("name"));*/
      //  System.out.println("redis 存储的字符串为: "+ jedis.);
        List<String> rsmap=jedis.lrange("plist", 0, -1);
        System.out.println(rsmap);

	}

}
    
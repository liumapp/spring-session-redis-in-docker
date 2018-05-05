package com.liumapp.docker.redis;

import com.liumapp.redis.operator.Main;
import com.liumapp.redis.operator.config.RedisConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author liumapp
 * @file SpringSessionRedisInDocker.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/5/18
 */
@SpringBootApplication
@Import({
		Main.class,
		RedisConfig.class
})
public class SpringSessionRedisInDocker {

	public static void main(String[] args) {
		SpringApplication.run(SpringSessionRedisInDocker.class, args);
	}
}

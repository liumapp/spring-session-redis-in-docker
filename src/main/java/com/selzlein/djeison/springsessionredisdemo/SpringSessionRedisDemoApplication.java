package com.selzlein.djeison.springsessionredisdemo;

import com.liumapp.redis.operator.Main;
import com.liumapp.redis.operator.config.RedisConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
		Main.class,
		RedisConfig.class
})
public class SpringSessionRedisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSessionRedisDemoApplication.class, args);
	}
}

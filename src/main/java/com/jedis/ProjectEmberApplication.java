package com.jedis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jedis.test.JedisTest;

/**
 * Sample application to connect to both MySql DB and Redis; utilizing
 * Jedis to copy DB into Redis cache.
 * 
 * 
 * @author Gary McGuire and Sean Clements
 *
 */

@SpringBootApplication
public class ProjectEmberApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectEmberApplication.class, args);
	}
	
	
}

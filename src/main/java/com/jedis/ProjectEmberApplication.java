package com.jedis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Sample application to connect to both MySql DB and Redis; utilizing
 * Jedis to copy DB into Redis cache.
 * 
 * 
 * @author Gary McGuire and Sean Clements
 *
 */

@SpringBootApplication
//@EnableCaching
public class ProjectEmberApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(ProjectEmberApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectEmberApplication.class, args);
	}
	
	
}

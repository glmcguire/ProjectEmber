package com.jedis.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

import com.jedis.entities.User;
import com.jedis.repositories.UserRepository;

@Component
@EnableAutoConfiguration
public class JedisTest {
	
	
	
	//TODO Once tables are set up, entities are created, and repository's made,
	//we will then autowire dao here.
	@Autowired
	UserRepository userRepos;
	
	
//	Jedis jedis = new Jedis("localhost");
	
	/**
	 * This method will copy the MySQL table into Redis cache using 
	 * numbers as the cacheKey value, which should match each row's unique
	 * ID from MySQL.
	 * 
	 * 
	 * 
	 * Currently, it is just set up for DB connection testing.
	 */
	public void  copyDB(){
		
		List<User> users = (List<User>) userRepos.findAll();
		users.forEach(i -> System.out.println(i));
		
		
		
	}
	
	
}

package com.jedis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jedis.entities.User;
import com.jedis.repositories.UserRepository;

import redis.clients.jedis.Jedis;

@Service
@Repository
public class JedisTest {
	
	
	
	//TODO Once tables are set up, entities are created, and repository's made,
	//we will then autowire dao here.
	@Autowired
	UserRepository userRepos;
	
	
	Jedis jedis = new Jedis("localhost");
	
	/**
	 * This method will copy the MySQL table into Redis cache using 
	 * numbers as the cacheKey value, which should match each row's unique
	 * ID from MySQL.
	 */
	@Transactional
	public void  copyDB(){
		
		List<User> users = (List<User>) userRepos.findAll();
		users.forEach(i -> System.out.println(i));
		
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
	}
	
	
}

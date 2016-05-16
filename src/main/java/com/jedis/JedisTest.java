package com.jedis;

import redis.clients.jedis.Jedis;

public class JedisTest {
	
	
	
	//TODO Once tables are set up, entities are created, and repository's made,
	//we will then autowire dao here.
	
	
	
	Jedis jedis = new Jedis("localhost");
	
	/**
	 * This method will copy the MySQL table into Redis cache using 
	 * numbers as the cacheKey value, which should match each row's unique
	 * ID from MySQL.
	 */
	public void copyDB(){
		
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

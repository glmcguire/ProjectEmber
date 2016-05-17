package com.jedis.repositories;

import redis.clients.jedis.Jedis;

/**
 * This class is a collection of tools utilizing the 
 * Jedis framework to interact with Redis.
 * 
 * @author Gary McGuire and Sean Clements
 *
 */
public class JedisUtilities {
	
	/**
	 * This method pushes the object into redis as a hash, stored by a key value,
	 * field name (usually the name of the object), and the string value of the 
	 * object itself.
	 * 
	 * @param key
	 * @param field
	 * @param value
	 */
	public static void persistEntry(String key, String field, String value, Jedis jedis){
		jedis.hset(field, key, value);
	}
}

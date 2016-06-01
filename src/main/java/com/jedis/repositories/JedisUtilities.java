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
	 * field value, and the string value of the object itself.
	 * 
	 * @param key
	 * @param field
	 * @param value
	 */
	public static void persistEntry(String key, String field, String value, Jedis jedis){
		jedis.hset(field, key, value);
	}
	
	/**
	 * This method retrieves a hash from redis,
	 * at the location indicated by the key and field values.
	 * 
	 * @param key
	 * @param field
	 * @param jedis
	 * @return String
	 */
	public static String retrieveEntry(String key, String field, Jedis jedis){
		return jedis.hget(key, field);
	}
	
	/**
	 * Method that deletes a hash stored at the {key} and {field}.
	 * 
	 * @param key
	 * @param field
	 * @param jedis
	 */
	public static void deleteHEntry(String key, String field, Jedis jedis){
		jedis.hdel(key, field);
	}
	
}

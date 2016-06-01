package com.jedis.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jedis.entities.User;
import com.jedis.repositories.JedisUtilities;
import com.jedis.repositories.UserRepository;

import redis.clients.jedis.Jedis;

/**
 * This controller was created to allow for manual calls of redis persists and
 * retrievals to be performed.
 * 
 * @author Gary McGuire and Sean Clements
 *
 */
@Component
@RestController
@EnableAutoConfiguration
public class RedisController {

	@Autowired
	private UserRepository userRep;
	
	private Jedis jedis = new Jedis("localhost");
	
	private String user = "user";
	
	/**
	 * This rest mapping allows for the jedis persistEntry to be called on
	 * all objects in the User table as well as displays the objects within 
	 * a rest client. 
	 * 
	 * @return Map<String, String>
	 */
	@RequestMapping(value = "/storeUserTable", method = RequestMethod.GET)
	public Map<String, String> storeUserTable() {
		List<User> list = (List<User>) userRep.findAll();
		list.forEach(e -> JedisUtilities.persistEntry(String.valueOf(e.getUserId()), user, e.toString(), jedis));
		return jedis.hgetAll(user);
	}
	/**
	 * Rest mapping that deletes the entire tables cached under the user key. This
	 * mapping is mainly for jedis testing purposes and most likely would not be
	 * utilized in a main application unless clearing entire caches is needed. 
	 * 
	 * @return Map<String, String>
	 */
	@RequestMapping(value = "/deleteUserTable", method = RequestMethod.GET)
	public Map<String, String> deleteUserCache(){
		List<User> list = (List<User>) userRep.findAll();
		list.forEach(i -> JedisUtilities.deleteHEntry(user, String.valueOf(i.getUserId()), jedis));
		return jedis.hgetAll(user);
	}
	
	

}
package com.jedis.controllers;

import java.util.List;

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
	 * @return Iterable<User>
	 */
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public Iterable<User> getUsers() {
		List<User> list = (List<User>) userRep.findAll();
		for(int i = 0; i < list.size(); i++){
			JedisUtilities.persistEntry(Integer.toString(i + 1), user, list.get(i).toString(), jedis);
		}
		return list;
	}
	
	

}
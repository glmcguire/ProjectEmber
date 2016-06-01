package com.jedis.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jedis.entities.User;


/**
 * Simple CrudRepository created to return all users from DB.
 * 
 * @author Gary McGuire and Sean Clements
 *
 */
@Transactional
public interface UserRepository extends CrudRepository<User, Long> {
	
	// Work in progress.... this may be needed for Spring Caching
	//	@Override
	//	@Cacheable("users")
	//	public List<User> findAll();
}

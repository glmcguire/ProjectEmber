package com.jedis.repositories;

import java.util.List;

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
	
	List<User> findAll();

}

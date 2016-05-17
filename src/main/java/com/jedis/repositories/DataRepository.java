package com.jedis.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jedis.entities.Data;
/**
 * Simple CrudRepository that pulls all Data from DB.
 * 
 * @author Gary McGuire and Sean Clements
 *
 */

@Transactional
public interface DataRepository extends CrudRepository<Data, Long> {
	
}

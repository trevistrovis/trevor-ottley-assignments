package com.codingdojo.trevor.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.trevor.models.User;

@Repository
public interface UserRepository extends CrudRepository <User, Long>{
	
	User findByEmail(String email);

}

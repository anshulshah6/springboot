package com.springboot.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	public List<User> findByUserName(String name);
}

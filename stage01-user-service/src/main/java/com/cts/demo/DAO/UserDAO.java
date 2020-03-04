package com.cts.demo.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cts.demo.model.User;

public interface UserDAO extends CrudRepository<User, Integer>{
	
	//public List<User> findByFNameOrLName(String name);

}

package com.cts.demo.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cts.demo.DAO.UserDAO;
import com.cts.demo.model.User;


@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService{
	
	
	private UserDAO userDAO;

	public UserServiceImpl(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public Iterable<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

}

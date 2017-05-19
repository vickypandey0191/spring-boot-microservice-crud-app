/*
 * Copyright (c) 2017 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.ge.springbootstarter.user;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author predix -
 */
@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	
	// get all users..
	public List<User> getAllUsers()
	{
		List <User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
//		/*Iterator<User> userIterator = (Iterator<User>)userRepository.findAll();
//		while(userIterator.hasNext())
//		{
//			users.add(userIterator.next());
//		}*/
		return users;
		
	}
	
	public User getUser(Integer id)
	{
		return userRepository.findOne(id);
	}
	
	public void updateUser(String id, User user)
	{
		userRepository.save(user);
	}
	
	public void removeUser(Integer id)
	{
		userRepository.delete(id);
	}
	
	public void addUser(User user)
	{
		userRepository.save(user);
	}
	
}

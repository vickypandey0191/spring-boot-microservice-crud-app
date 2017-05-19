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

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author predix -
 */
@RestController
public class UserController 
{
	@Autowired
	private UserService userService;

	@RequestMapping("/users")
	public List<User>getAllUsers()
	{
		return userService.getAllUsers();
		//return Arrays.asList(new User("1", "Vicky", "25", "100"), new User("2", "Tom", "22", "1000"),new User("3", "Sam", "29", "100000"));
	}
	
	@RequestMapping("/users/{id}")
	public User getUser(@PathVariable Integer id)
	{
		return userService.getUser(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public void addUser(@RequestBody User user)
	{
		userService.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
	public void updateUser(@RequestBody User user, @PathVariable String id)
	{
		userService.updateUser(id, user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	public void removeUser(@PathVariable Integer id)
	{
		userService.removeUser(id);
	}
	
}

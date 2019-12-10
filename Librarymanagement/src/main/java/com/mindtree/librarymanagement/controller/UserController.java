package com.mindtree.librarymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.librarymanagement.entity.Library;
import com.mindtree.librarymanagement.entity.User;
import com.mindtree.librarymanagement.service.LibraryService;
import com.mindtree.librarymanagement.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	LibraryService libraryService;
	
	@Autowired
	UserService userService;
	
	@PostMapping(value="/add/user")
	public String adduser(@RequestBody User user)
	{
		return  userService.addUser(user);
		
	}

	@GetMapping("/getuser/{id}")
	public List<User> getuser(@PathVariable("id") String userName)
	{
		return userService.getUser(userName);
	}
	
	@GetMapping("/getuserbyid/{id}")
	public User getuser1(@PathVariable("id") int userId)
	{
		return userService.getUser1(userId);
	}
	
}

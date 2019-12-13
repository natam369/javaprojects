package com.mindtree.librarymanagement.service;

import java.util.List;

import com.mindtree.librarymanagement.entity.User;

public interface UserService {

	public String addUser(User user);

	public List<User> getUser(String userName);

	public User getUser1(int userId);



}

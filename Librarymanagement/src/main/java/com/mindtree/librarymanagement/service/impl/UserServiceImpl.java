package com.mindtree.librarymanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.librarymanagement.entity.Library;
import com.mindtree.librarymanagement.entity.User;
import com.mindtree.librarymanagement.repository.LibraryRepository;
import com.mindtree.librarymanagement.repository.UserRepository;
import com.mindtree.librarymanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	LibraryRepository libraryRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub

		String msg = "";
		List<Library> libraries = user.getLibraries();
		libraryRepository.saveAll(libraries);
		userRepository.save(user);
		msg = " a new user inserted successfully";
		return msg;
	}

	@Override
	public List<User> getUser(String userName) {
		// TODO Auto-generated method stub
		
		return userRepository.findByUserName(userName);
	}

	@Override
	public User getUser1(int userId) {
		// TODO Auto-generated method stub
		
		return userRepository.getOne(userId);
	}

	

}

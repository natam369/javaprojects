package com.mindtree.librarymanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.librarymanagement.entity.Library;
import com.mindtree.librarymanagement.entity.User;
import com.mindtree.librarymanagement.repository.LibraryRepository;
import com.mindtree.librarymanagement.repository.UserRepository;
import com.mindtree.librarymanagement.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	LibraryRepository libraryRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public String addLibrary(Library library) {

		String msg = "";
		msg = "inserted successfully";
		
		List<User> users =library.getUsers();
		
		userRepository.saveAll(users);
		libraryRepository.saveAndFlush(library);
		
		return msg;
	}

	@Override
	public List<Library> getLibrary() {
		// TODO Auto-generated method stub

		return libraryRepository.findAll();
	}

	@Override
	public List<Library> getLibraryByCount() {
		// TODO Auto-generated method stub
		List<Library> libraries = libraryRepository.findAll();
		List<Library> newLibraries = new ArrayList<>();
		for (Library library : libraries) {
			if (library.getUsers().size() > 2) {
				newLibraries.add(library);
			}
		}
		return newLibraries;
	}

}

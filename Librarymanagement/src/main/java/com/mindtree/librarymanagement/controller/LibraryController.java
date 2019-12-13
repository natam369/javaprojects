package com.mindtree.librarymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.librarymanagement.entity.Library;
import com.mindtree.librarymanagement.service.LibraryService;
import com.mindtree.librarymanagement.service.UserService;

@RestController
public  class LibraryController {
	
	@Autowired
	LibraryService libraryService;
	
	@Autowired
	UserService userService;
	
	@PostMapping(value="/add/library")
	public String addlib(@RequestBody Library library)
	{
		return libraryService.addLibrary(library);
		
	}
	
	@GetMapping(value="/get/libraries")
	public List<Library> getlib()
	{
		return libraryService.getLibrary();
		
	}

	@GetMapping(value="/get/libraries/count")
	public List<Library> getlib1()
	{
		return libraryService.getLibraryByCount();
		
	}
}

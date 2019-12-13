package com.mindtree.librarymanagement.service;

import java.util.List;

import com.mindtree.librarymanagement.entity.Library;

public interface LibraryService {

	public String addLibrary(Library library);

	public List<Library> getLibrary();

	public List<Library> getLibraryByCount();

}

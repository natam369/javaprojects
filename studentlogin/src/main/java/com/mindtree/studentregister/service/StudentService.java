package com.mindtree.studentregister.service;

import java.util.List;

import com.mindtree.studentregister.entity.Student;

public interface StudentService {

	String addUser(Student student);

	String delStudent(int studentId);

	List<Student> getDetails();

	

}

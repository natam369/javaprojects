package com.mindtree.studentregister.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.studentregister.entity.Student;
import com.mindtree.studentregister.repository.StudentRepository;
import com.mindtree.studentregister.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public String addUser(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return "";
	}

	@Override
	public String delStudent(int studentId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(studentId);
		return "deleted successfully";
	}

	@Override
	public List<Student> getDetails() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	
}

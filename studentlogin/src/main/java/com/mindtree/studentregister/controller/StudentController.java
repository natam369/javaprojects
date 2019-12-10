package com.mindtree.studentregister.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.studentregister.entity.Student;
import com.mindtree.studentregister.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping("/")
	public String showform(Model m) {
		m.addAttribute("command", new Student());
		return "home";
	}

	@PostMapping("/addstudent/")
	public String add(@ModelAttribute Student student) {
		studentService.addUser(student);
		return "home";

	}

	@RequestMapping(value = "/delete/", method = RequestMethod.POST)
	public String remove(@RequestParam int studentId) {
		Student s = new Student();
		s.setId(studentId);
		studentService.delStudent(studentId);
		return "home";

	}

	@GetMapping("/view/")
	public String getall(ModelMap model) {
		List<Student> list = studentService.getDetails();
		model.put("stu", list);
		return "showstudents";
	}

}

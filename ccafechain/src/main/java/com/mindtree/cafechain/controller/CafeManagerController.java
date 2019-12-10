package com.mindtree.cafechain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.cafechain.entity.Cafe;
import com.mindtree.cafechain.exceptions.ServiceException;
import com.mindtree.cafechain.exceptions.service.ManagerNotFoundException;
import com.mindtree.cafechain.service.CafeManagerService;
import com.mindtree.cafechain.service.CafeService;

@RestController
public class CafeManagerController {

	@Autowired
	CafeService cafeService;

	@Autowired
	CafeManagerService cafeManagerService;

	@GetMapping("/get/cafe/{id}")
	public List<Cafe> getCafes(@PathVariable("id")int managerId)
	{
		try {
			String msg=cafeManagerService.validate(managerId);
		} catch (ServiceException e) {
		e.printStackTrace();
		}
		return cafeManagerService.getCafes(managerId);
		
	}

}

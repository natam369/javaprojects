package com.mindtree.cafechain.controller;

import java.util.List;

import javax.validation.constraints.Positive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.cafechain.entity.Cafe;
import com.mindtree.cafechain.service.CafeManagerService;
import com.mindtree.cafechain.service.CafeService;

@RestController
public class CafeController {
	
	
	@Autowired
	CafeService cafeService;
	
	@Autowired
	CafeManagerService cafeManagerService;
	
	@PostMapping(value="/add/cafe")
	public Cafe addCafe(@RequestBody Cafe cafe)
	{
		return cafeService.addCafeDetails(cafe);
		
	}

	@GetMapping(value="/getallcafes/{id}")
	public List<Cafe> Getcafes(@PathVariable("id") long checkRevenue)
	{
		return cafeService.getAllCafes(checkRevenue);
		
	}
}

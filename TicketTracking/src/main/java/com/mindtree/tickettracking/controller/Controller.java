package com.mindtree.tickettracking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.tickettracking.entity.CampusMind;
import com.mindtree.tickettracking.entity.Genie;
import com.mindtree.tickettracking.exceptions.ServiceException;
import com.mindtree.tickettracking.service.CampusMindService;
import com.mindtree.tickettracking.service.GenieService;

@RestController
public class Controller {

	@Autowired
	CampusMindService campusMindService;

	@Autowired
	GenieService genieService;

	@PostMapping("/add/campusmind")
	public CampusMind add(@RequestBody CampusMind campusMind) {

		System.out.println(campusMind);
		return campusMindService.addCampusMind(campusMind);
	}

	@RequestMapping("/add/genie/{id}")
	public List<Genie> addg(@PathVariable("id") String mid ,@RequestBody Genie genie)
	{
		return genieService.addgenie(mid,genie);
		
	}

	@GetMapping("/get/genie/{id}")
	public List<Genie> getgenie(@PathVariable("id") String mid) {
		return campusMindService.getGenie(mid);
	}

	@GetMapping("set/geniestatus/{id}")
	public Genie change(@PathVariable("id") int genieId) {

		return genieService.changeGenieStatus(genieId);

	}
}
package com.mindtree.tickettracking.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.tickettracking.entity.CampusMind;
import com.mindtree.tickettracking.entity.Genie;
import com.mindtree.tickettracking.repository.CampusMindRepository;
import com.mindtree.tickettracking.repository.GenieRepository;
import com.mindtree.tickettracking.service.CampusMindService;
import com.mindtree.tickettracking.service.GenieService;

@Service
public class GenieServiceImpl implements GenieService {

	@Autowired
	CampusMindRepository campusMindRepository;

	@Autowired
	GenieRepository genieRepository;

	@Override
	public Genie changeGenieStatus(int genieId) {
		// TODO Auto-generated method stub
		Genie genie = genieRepository.getOne(genieId);
		if (genie.isGenieStatus() == true) {
			genie.setGenieStatus(false);
		} else {
			genie.setGenieStatus(true);
		}
		genieRepository.save(genie);
		return genie;
	}

	@Override
	public List<Genie> addgenie(String mid, Genie genie) {
		// TODO Auto-generated method stub
		CampusMind c = campusMindRepository.getOne(mid);
		genie.setCampusMind(c);
		c.getGenie().add(genie);
		campusMindRepository.save(c);
		return c.getGenie();
	}

}

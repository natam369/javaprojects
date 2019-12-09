package com.mindtree.cafechain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.manager.ManagerServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.cafechain.entity.Cafe;
import com.mindtree.cafechain.entity.CafeManager;
import com.mindtree.cafechain.exceptions.service.ManagerNotFoundException;
import com.mindtree.cafechain.repository.CafeManagerRepository;
import com.mindtree.cafechain.repository.CafeRepository;
import com.mindtree.cafechain.service.CafeManagerService;
@Service
public class CafeManagerServiceImpl implements CafeManagerService{
	
	@Autowired
	CafeRepository cafeRepository;
	
	@Autowired
	CafeManagerRepository cafeManagerRepository;
	

	@Override
	public List<Cafe> getCafes(int managerId) {
		// TODO Auto-generated method stub
		
		CafeManager cafeManager = cafeManagerRepository.getOne(managerId);
		List<Cafe> cafes=cafeManager.getCafes();
		return cafes;
	}


	@Override
	public String validate(int managerId) throws ManagerNotFoundException {
		// TODO Auto-generated method stub
		String msg="";
		List<Integer> managerIds=new ArrayList<>();
		List<CafeManager> cafeManagers =cafeManagerRepository.findAll();
		for (CafeManager cafeManager : cafeManagers) {
			int id =cafeManager.getManagerId();
			managerIds.add(id);
		}
		if(!managerIds.contains(managerId))
		{
			throw new ManagerNotFoundException("no such manager with given id");
		}
		return msg;
	}

}

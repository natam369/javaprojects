package com.mindtree.cafechain.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.cafechain.entity.Cafe;
import com.mindtree.cafechain.entity.CafeManager;
import com.mindtree.cafechain.repository.CafeManagerRepository;
import com.mindtree.cafechain.repository.CafeRepository;
import com.mindtree.cafechain.service.CafeService;

@Service
public class CafeServiceImpl implements CafeService {
	
	
	
	@Autowired
	CafeRepository cafeRepository;
	
	@Autowired
	CafeManagerRepository cafeManagerRepository;

	@Override
	public Cafe addCafeDetails(Cafe cafe) {
		// TODO Auto-generated method stub
		CafeManager cafeManager=cafe.getCafeManager();
		cafeManagerRepository.save(cafeManager);
		return  cafeRepository.save(cafe);																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
	}

	@Override
	public List<Cafe> getAllCafes(long checkRevenue) {
		// TODO Auto-generated method stub
		List<Cafe> cafes =cafeRepository.findAll();
		List<Cafe> newCafes=new ArrayList<Cafe>();
		for (Cafe cafe : cafes) {
			if(cafe.getCafeRevenue()>checkRevenue)
			{
				newCafes.add(cafe);
			}
		}		
		
		return newCafes;
	}

}

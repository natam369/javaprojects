package com.mindtree.cafechain.service;

import java.util.List;

import com.mindtree.cafechain.entity.Cafe;

public interface CafeService {

	public Cafe addCafeDetails(Cafe cafe);

	public List<Cafe> getAllCafes(long checkRevenue);

}

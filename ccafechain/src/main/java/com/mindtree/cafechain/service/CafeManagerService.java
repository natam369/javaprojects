package com.mindtree.cafechain.service;

import java.util.List;

import com.mindtree.cafechain.entity.Cafe;
import com.mindtree.cafechain.exceptions.service.ManagerNotFoundException;

public interface CafeManagerService {

	public List<Cafe> getCafes(int managerId);

	public String validate(int managerId) throws ManagerNotFoundException;

}

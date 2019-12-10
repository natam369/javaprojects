package com.mindtree.tickettracking.service;

import java.util.List;
import java.util.Set;

import com.mindtree.tickettracking.entity.CampusMind;
import com.mindtree.tickettracking.entity.Genie;

public interface GenieService {

	Genie changeGenieStatus(int genieId);

	List<Genie> addgenie(String mid, Genie genie);

}

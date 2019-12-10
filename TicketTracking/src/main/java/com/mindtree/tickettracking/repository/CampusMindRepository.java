package com.mindtree.tickettracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.tickettracking.entity.CampusMind;

@Repository
public interface CampusMindRepository extends JpaRepository<CampusMind, String>{

}

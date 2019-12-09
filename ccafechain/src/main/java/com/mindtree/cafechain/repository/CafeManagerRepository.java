package com.mindtree.cafechain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.cafechain.entity.CafeManager;

@Repository
public interface CafeManagerRepository extends JpaRepository<CafeManager, Integer>{

}

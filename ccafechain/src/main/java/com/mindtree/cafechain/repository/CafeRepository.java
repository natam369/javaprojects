package com.mindtree.cafechain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.cafechain.entity.Cafe;

@Repository
public interface CafeRepository extends JpaRepository<Cafe, Integer> {

}

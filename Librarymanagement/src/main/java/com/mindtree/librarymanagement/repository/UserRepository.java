package com.mindtree.librarymanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.librarymanagement.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	List<User> findByUserName(String userName);
	

}

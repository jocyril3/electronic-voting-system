package com.deloitte.votingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.votingsystem.model.Election;

public interface ElectionRepository extends JpaRepository<Election,Integer>{
	
	

}

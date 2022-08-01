package com.deloitte.votingsystem.service;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.votingsystem.model.Election;
import com.deloitte.votingsystem.model.PincodeTable;
import com.deloitte.votingsystem.repository.ElectionRepository;

@Service
public class PincodeTableService {
	
	@Autowired
	ElectionRepository electionRepository;
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public List<Election> getAllElections() {
		return electionRepository.findAll();
	}

	public Election addElection(Election election) {
		LOG.info(election.toString());
		return electionRepository.save(election);
	}

	public Election updateElection(Election election) {
		LOG.info(election.toString());
		return electionRepository.save(election);
	}

	public Election deleteElection(int electionId) {
		LOG.info(Integer.toString(electionId));
		electionRepository.deleteById(electionId);
		return null;
	}

	public static List<PincodeTable> getPincode() {
		return electionRepository.findAll();
		
	}

	public static PincodeTable addPincode(@Valid PincodeTable pincodeTable) {
		// TODO Auto-generated method stub
		return null;
	}

}

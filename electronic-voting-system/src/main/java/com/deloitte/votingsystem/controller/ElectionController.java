package com.deloitte.votingsystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.votingsystem.model.Election;
import com.deloitte.votingsystem.service.ElectionService;


@RestController
@RequestMapping("/election")
public class ElectionController {
	
	@Autowired
	ElectionService electionService;
	
	@RequestMapping(path = "/get-all-elections", method = RequestMethod.GET)
	public ResponseEntity<List<Election>> getAllElections() {
		List<Election> electionList = electionService.getAllElections();
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("Message", ("All Election records generated successfully"));
		ResponseEntity<List<Election>> responseEntity = new ResponseEntity(electionList, headers, status);
		return responseEntity;
	}
	

	@RequestMapping(path = "/add-election", method = RequestMethod.POST)
	public ResponseEntity<Election> addElection(@Valid @RequestBody Election election) {
		Election elect = electionService.addElection(election);
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("Message", ("Election with id "+ election.getElectionId()+" was added successfully"));
		ResponseEntity<Election> responseEntity = new ResponseEntity(elect, headers, status);
		return responseEntity;
	}
	
	@RequestMapping(path = "/update-election", method = RequestMethod.PUT)
	public ResponseEntity<Election> updateElection(@Valid @RequestBody Election election) {
		Election elect = electionService.updateElection(election);
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("Message", ("Election with id "+ election.getElectionId()+" was updated successfully"));
		ResponseEntity<Election> responseEntity = new ResponseEntity(election, headers, status);
		return responseEntity;
	}

	@RequestMapping(path = "/delete-election/{eid}", method = RequestMethod.DELETE)
	public ResponseEntity<Election> deleteElection(@PathVariable(name = "eid") int electionId) {
		Election elect = electionService.deleteElection(electionId);
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("Message", ("Election with id "+ electionId+" was deleted successfully"));
		ResponseEntity<Election> responseEntity = new ResponseEntity(elect, headers, status);
		return responseEntity;
	}
}

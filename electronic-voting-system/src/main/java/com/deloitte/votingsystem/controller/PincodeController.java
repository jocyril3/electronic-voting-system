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
import com.deloitte.votingsystem.model.PincodeTable;
import com.deloitte.votingsystem.service.ElectionService;
import com.deloitte.votingsystem.service.PincodeTableService;


@RestController
@RequestMapping("/pincode")
public class PincodeController {

	@Autowired
	PincodeTableService pincodeTableService;
	
	@RequestMapping(path = "/get-pincode", method = RequestMethod.GET)
	public ResponseEntity<List<PincodeTable>> getPincode() {
		List<PincodeTable> pincodeTable = PincodeTableService.getPincode();
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("Message", ("All pincodes generated successfully"));
		ResponseEntity<List<PincodeTable>> responseEntity = new ResponseEntity(pincodeTable, headers, status);
		return responseEntity;
	}
	

	@RequestMapping(path = "/add-pincode", method = RequestMethod.POST)
	public ResponseEntity<PincodeTable> addPincode(@Valid @RequestBody PincodeTable pincodeTable ) {
		PincodeTable pin = PincodeTableService.addPincode(pincodeTable);
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("Message", ("For the constituency the Pincode "+ pincodeTable.getPincodeId()+" was added successfully"));
		ResponseEntity<PincodeTable> responseEntity = new ResponseEntity(pin, headers, status);
		return responseEntity;
	}
	
	
}

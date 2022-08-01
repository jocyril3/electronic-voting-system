package com.deloitte.votingsystem.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "election_table")
public class Election {

	@Id
	@GenericGenerator(name = "elec_seq", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "elec_seq")
	private int electionId;
	
	private String electionName;
	private String electionType;
	private String electionDate;
	
	public Election() {
		super();
	}
	public Election(int electionId, String electionName, String electionType, String electionDate) {
		super();
		this.electionId = electionId;
		this.electionName = electionName;
		this.electionType = electionType;
		this.electionDate = electionDate;
	}
	public int getElectionId() {
		return electionId;
	}
	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}
	public String getElectionName() {
		return electionName;
	}
	public void setElectionName(String electionName) {
		this.electionName = electionName;
	}
	public String getElectionType() {
		return electionType;
	}
	public void setElectionType(String electionType) {
		this.electionType = electionType;
	}
	public String getElectionDate() {
		return electionDate;
	}
	public void setElectionDate(String electionDate) {
		this.electionDate = electionDate;
	}
	@Override
	public String toString() {
		return "Election [electionId=" + electionId + ", electionName=" + electionName + ", electionType="
				+ electionType + ", electionDate=" + electionDate + "]";
	}
	
	
	
}

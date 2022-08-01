package com.deloitte.votingsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "constituency_table")
public class Constituency {

	@Id
	@GenericGenerator(name = "constituency_seq", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "constituency_seq")
	private String constituencyId;
	private String constituencyName;
	private String electionId;
	private String state;
	
	public Constituency() {
		super();
	}

	public Constituency(String constituencyId, String constituencyName, String electionId, String state) {
		super();
		this.constituencyId = constituencyId;
		this.constituencyName = constituencyName;
		this.electionId = electionId;
		this.state = state;
	}

	public String getConstituencyId() {
		return constituencyId;
	}

	public void setConstituencyId(String constituencyId) {
		this.constituencyId = constituencyId;
	}

	public String getConstituencyName() {
		return constituencyName;
	}

	public void setConstituencyName(String constituencyName) {
		this.constituencyName = constituencyName;
	}

	public String getElectionId() {
		return electionId;
	}

	public void setElectionId(String electionId) {
		this.electionId = electionId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Constituency [constituencyId=" + constituencyId + ", constituencyName=" + constituencyName
				+ ", electionId=" + electionId + ", state=" + state + "]";
	}
	
	
}

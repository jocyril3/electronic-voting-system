package com.deloitte.votingsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "candidates_table")
public class Candidate {

	@Id
	@GenericGenerator(name = "candidate_seq", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "candidate_seq")
	private String candidateId;
	private String constituencyId;
	private String partyRegId;
	private String candidateName;
	public Candidate() {
		super();
	}
	public Candidate(String candidateId, String constituencyId, String partyRegId, String candidateName) {
		super();
		this.candidateId = candidateId;
		this.constituencyId = constituencyId;
		this.partyRegId = partyRegId;
		this.candidateName = candidateName;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getConstituencyId() {
		return constituencyId;
	}
	public void setConstituencyId(String constituencyId) {
		this.constituencyId = constituencyId;
	}
	public String getPartyRegId() {
		return partyRegId;
	}
	public void setPartyRegId(String partyRegId) {
		this.partyRegId = partyRegId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", constituencyId=" + constituencyId + ", partyRegId="
				+ partyRegId + ", candidateName=" + candidateName + "]";
	}
	
	
}

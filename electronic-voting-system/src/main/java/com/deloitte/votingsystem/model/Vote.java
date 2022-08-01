package com.deloitte.votingsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "vote_table")
public class Vote {

	@Id
	@GenericGenerator(name = "vote_seq", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vote_seq")
	private String voteId;
	private String Epic;
	private String candidateId;
	public Vote() {
		super();
	}
	public Vote(String voteId, String epic, String candidateId) {
		super();
		this.voteId = voteId;
		Epic = epic;
		this.candidateId = candidateId;
	}
	public String getVoteId() {
		return voteId;
	}
	public void setVoteId(String voteId) {
		this.voteId = voteId;
	}
	public String getEpic() {
		return Epic;
	}
	public void setEpic(String epic) {
		Epic = epic;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	@Override
	public String toString() {
		return "Vote [voteId=" + voteId + ", Epic=" + Epic + ", candidateId=" + candidateId + "]";
	}
	
	
	
}

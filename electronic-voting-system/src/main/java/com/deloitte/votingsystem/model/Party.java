package com.deloitte.votingsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "party_table")
public class Party {

	@Id
	@GenericGenerator(name = "party_seq", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "party_seq")
	private String regId;
	private String partyName;
	private String symbol;
	private String leader;
	public Party() {
		super();
	}
	public Party(String regId, String partyName, String symbol, String leader) {
		super();
		this.regId = regId;
		this.partyName = partyName;
		this.symbol = symbol;
		this.leader = leader;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	@Override
	public String toString() {
		return "Party [regId=" + regId + ", partyName=" + partyName + ", symbol=" + symbol + ", leader=" + leader + "]";
	}
	
	
}

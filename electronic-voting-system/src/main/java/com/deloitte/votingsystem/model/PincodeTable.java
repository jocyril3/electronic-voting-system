package com.deloitte.votingsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "pincode_table")
public class PincodeTable {

	@Id
	private String pincodeId;
	private String constituencyName;
	private String constituencyId;
	private String state;
	

	public PincodeTable() {
		super();
	}

	public PincodeTable(String constituencyName, String constituencyId, String state, String pincodeId) {
		super();
		this.constituencyName = constituencyName;
		this.constituencyId = constituencyId;
		this.state = state;
		this.pincodeId = pincodeId;
	}

	public String getConstituencyName() {
		return constituencyName;
	}

	public void setConstituencyName(String constituencyName) {
		this.constituencyName = constituencyName;
	}

	public String getConstituencyId() {
		return constituencyId;
	}

	public void setConstituencyId(String constituencyId) {
		this.constituencyId = constituencyId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincodeId() {
		return pincodeId;
	}

	public void setPincodeId(String pincodeId) {
		this.pincodeId = pincodeId;
	}

	@Override
	public String toString() {
		return "PincodeTable [constituencyName=" + constituencyName + ", constituencyId=" + constituencyId + ", state="
				+ state + ", pincodeId=" + pincodeId + "]";
	}

}

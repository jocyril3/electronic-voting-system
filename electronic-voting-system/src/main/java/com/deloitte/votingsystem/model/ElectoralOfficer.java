package com.deloitte.votingsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "eo_table")
public class ElectoralOfficer {

	@Id
	@GenericGenerator(name = "eo_seq", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eo_seq")
	private String electoralOfficerId;
	private String electoralOfficerName;
	private String electoralOfficerPassword;

	public ElectoralOfficer() {
		super();
	}

	public ElectoralOfficer(String electoralOfficerName, String electoralOfficerId, String electoralOfficerPassword) {
		super();
		this.electoralOfficerName = electoralOfficerName;
		this.electoralOfficerId = electoralOfficerId;
		this.electoralOfficerPassword = electoralOfficerPassword;
	}

	public String getElectoralOfficerName() {
		return electoralOfficerName;
	}

	public void setElectoralOfficerName(String electoralOfficerName) {
		this.electoralOfficerName = electoralOfficerName;
	}

	public String getElectoralOfficerId() {
		return electoralOfficerId;
	}

	public void setElectoralOfficerId(String electoralOfficerId) {
		this.electoralOfficerId = electoralOfficerId;
	}

	public String getElectoralOfficerPassword() {
		return electoralOfficerPassword;
	}

	public void setElectoralOfficerPassword(String electoralOfficerPassword) {
		this.electoralOfficerPassword = electoralOfficerPassword;
	}

	@Override
	public String toString() {
		return "ElectoralOfficer [electoralOfficerName=" + electoralOfficerName + ", electoralOfficerId="
				+ electoralOfficerId + ", electoralOfficerPassword=" + electoralOfficerPassword + "]";
	}
}

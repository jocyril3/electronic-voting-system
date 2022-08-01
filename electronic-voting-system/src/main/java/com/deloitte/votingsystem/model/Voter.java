package com.deloitte.votingsystem.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "voters_table")
public class Voter {

	@Id
	@GenericGenerator(name = "voter_seq", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "voter_seq")
	private String epic;
	private String voterName;
	private Gender gender;
	private String status;
	private String voterPassword;
	private String district;
	private Date dob;
	private int Mobile;
	private String address;
	public Voter() {
		super();
	}
	public Voter(String voterName, Gender gender, String status, String voterPassword, String district, String epic,
			Date dob, int mobile, String address) {
		super();
		this.voterName = voterName;
		this.gender = gender;
		this.status = status;
		this.voterPassword = voterPassword;
		this.district = district;
		this.epic = epic;
		this.dob = dob;
		this.Mobile = mobile;
		this.address = address;
	}
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVoterPassword() {
		return voterPassword;
	}
	public void setVoterPassword(String voterPassword) {
		this.voterPassword = voterPassword;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getEpic() {
		return epic;
	}
	public void setEpic(String epic) {
		this.epic = epic;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getMobile() {
		return Mobile;
	}
	public void setMobile(int mobile) {
		Mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Voter [voterName=" + voterName + ", gender=" + gender + ", status=" + status + ", voterPassword="
				+ voterPassword + ", district=" + district + ", epic=" + epic + ", dob=" + dob + ", Mobile=" + Mobile
				+ ", address=" + address + "]";
	}
	
	

}

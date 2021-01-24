package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class UserRegistration {
	/*@Id
	@GeneratedValue
	private Integer id;*/
	@Id
    private String regId;
	private String fname;
	private String lname;
	private Date dob;
	private String gender;
	private Integer ssnNo;
	private String email;

	/*public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}*/
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getSsnNo() {
		return ssnNo;
	}
	public void setSsnNo(Integer ssnNo) {
		this.ssnNo = ssnNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserRegistration [regId=" + regId + ", fname=" + fname + ", lname=" + lname + ", dob="
				+ dob + ", gender=" + gender + ", ssnNo=" + ssnNo + ", email=" + email + "]";
	}
	
	
	
	
	
	
}

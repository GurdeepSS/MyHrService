package com.rohini.myhrservice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="contact")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="contact_id")
	private int id;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email_address")
	private String emailAddress;
	
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="time_created")
	private Date timeCreated;
	
	@Column(name="time_updated")
	private Date timeUpdated;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}

	public Date getTimeUpdated() {
		return timeUpdated;
	}

	public void setTimeUpdated(Date timeUpdated) {
		this.timeUpdated = timeUpdated;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", phoneNumber=" + phoneNumber
				+ ", emailAddress=" + emailAddress + ", empId=" + empId
				+ ", timeCreated=" + timeCreated + ", timeUpdated="
				+ timeUpdated + "]";
	}

	
}


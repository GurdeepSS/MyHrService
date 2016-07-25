package com.rohini.myhrservice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="qualification")
public class Qualification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="qualification_id")
	private int id;
	
	@Column(name="education_level")
	private String educationLevel;
	
	@Column(name="major")
	private String major;
	
	@Column(name="gpa")
	private String gpa;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;


	@Column(name="time_created")
	private Date timeCreated;
	
	@Column(name="time_updated")
	private Date timeUpdated;
	
	@Column(name="emp_id")
	private int empId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
		return "Qualification [id=" + id + ", educationLevel=" + educationLevel
				+ ", major=" + major + ", gpa=" + gpa + ", startDate="
				+ startDate + ", endDate=" + endDate + ", timeCreated="
				+ timeCreated + ", timeUpdated=" + timeUpdated + ", empId="
				+ empId + "]";
	}


	
	
}


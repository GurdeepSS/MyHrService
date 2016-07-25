package com.rohini.myhrservice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="salary")
public class Salary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="salary_id")
	private int id;
	
	@Column(name="pay_grade")
	private String payGrade;
	
	@Column(name="currency_code")
	private String currencCode;
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="pay_frequency")
	private String payFrequency;
	
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

	public String getPayGrade() {
		return payGrade;
	}

	public void setPayGrade(String payGrade) {
		this.payGrade = payGrade;
	}

	public String getCurrencCode() {
		return currencCode;
	}

	public void setCurrencCode(String currencCode) {
		this.currencCode = currencCode;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getPayFrequency() {
		return payFrequency;
	}

	public void setPayFrequency(String payFrequency) {
		this.payFrequency = payFrequency;
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
		return "Salary [id=" + id + ", payGrade=" + payGrade + ", currencCode="
				+ currencCode + ", salary=" + salary + ", payFrequency="
				+ payFrequency + ", startDate=" + startDate + ", endDate="
				+ endDate + ", timeCreated=" + timeCreated + ", timeUpdated="
				+ timeUpdated + ", empId=" + empId + "]";
	}


	
}


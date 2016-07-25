package com.rohini.myhrservice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="address_id")
	private int id;
	
	@Column(name="street_number")
	private String streetNumber;
	
	@Column(name="street_name")
	private String streetName;
	
	@Column(name="additional_guidance")
	private String additionalGuidance;
	
	@Column(name="city")
	private String city;
	
	@Column(name="province")
	private String province;
	
	@Column(name="postal_code")
	private String postalCode;
	
	@Column(name="country_code")
	private String countryCode;

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

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getAdditionalGuidance() {
		return additionalGuidance;
	}

	public void setAdditionalGuidance(String additionalGuidance) {
		this.additionalGuidance = additionalGuidance;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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
		return "Address [id=" + id + ", streetNumber=" + streetNumber
				+ ", streetName=" + streetName + ", additionalGuidance="
				+ additionalGuidance + ", city=" + city + ", province="
				+ province + ", postalCode=" + postalCode + ", countryCode="
				+ countryCode + ", timeCreated=" + timeCreated
				+ ", timeUpdated=" + timeUpdated + ", empId=" + empId + "]";
	}




	
}


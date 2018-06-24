package com.example.demo.model;

import java.sql.Date;

public class TravelDetails {
	private int passenger_id;
	private String name;
	private String mname;
	private String lname;
	private String country;
	private String phonenumber;
	private String gender;
	//private Date dob;
	private String dob;
	private String cardholder;
	//private Date ExDa;
	private String ExDa;
	private String security;
	
	public int getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
/*public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}*/
		public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCardholder() {
		return cardholder;
	}
	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}
	
/*public Date getExDa() {
		return ExDa;
	}
	public void setExDa(Date exDa) {
		ExDa = exDa;
	}*/
	public String getExDa() {
		return ExDa;
	}
	public void setExDa(String exDa) {
		ExDa = exDa;
	}
	public String getSecurity() {
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	

}

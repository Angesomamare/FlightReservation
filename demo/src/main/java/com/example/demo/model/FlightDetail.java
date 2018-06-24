package com.example.demo.model;

public class FlightDetail {
	
	private String name;
	private String email;
	private String gender;
	private String langauge;
	private String departing;
	private String returning;
	private String destination;
	public FlightDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightDetail(String name, String email, String gender, String langauge, String departing, String returning,
			String destination) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.langauge = langauge;
		this.departing = departing;
		this.returning = returning;
		this.destination = destination;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLangauge() {
		return langauge;
	}
	public void setLangauge(String langauge) {
		this.langauge = langauge;
	}
	public String getDeparting() {
		return departing;
	}
	public void setDeparting(String departing) {
		this.departing = departing;
	}
	public String getReturning() {
		return returning;
	}
	public void setReturning(String returning) {
		this.returning = returning;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "FlightDetail [name=" + name + ", email=" + email + ", gender=" + gender + ", langauge=" + langauge
				+ ", departing=" + departing + ", returning=" + returning + ", destination=" + destination + "]";
	}
	

}

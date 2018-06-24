package com.example.demo.model;

import java.util.List;

public class Person {
	private String name;
	private String email;
	private String gender;
	private List<String> lang;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String email, String gender, List<String> lang) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.lang = lang;
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
	public List<String> getLang() {
		return lang;
	}
	public void setLang(List<String> lang) {
		this.lang = lang;
	}

	
}

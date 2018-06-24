package com.example.demo.model;

import java.util.Date;

import javax.xml.crypto.Data;

public class myModel {
	

	private String name;
	private String age;
	//private Date date;
	
	public myModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public myModel(String name, String age /*,Date date*/) {
		super();
		this.name = name;
		this.age = age;
		//this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	/*public Data getDate() {
		return date;
	}
	public void setDate(Data date) {
		this.date = date;
	}
	*/@Override
	public String toString() {
		return "myModel [name=" + name + ", age=" + age + "]";
	}


}

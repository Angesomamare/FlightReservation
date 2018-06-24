package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.myModel;

@Repository
public class Mdao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	
	public void create(myModel m) {
		System.out.println("Inserting data"+ m);
		String name = m.getName();
		int age = Integer.parseInt(m.getAge());

		String sql="INSERT INTO HR.person (name, age) VALUES ('"+name+"', '"+age+"')";

		System.out.println("create person entity "+ sql);
		jdbcTemplate.update(sql);
		
	}

}

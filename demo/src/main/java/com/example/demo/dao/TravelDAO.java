package com.example.demo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import com.example.demo.constants.FligghtConstants;
import com.example.demo.controller.HomeController;
import com.example.demo.model.TravelDetails;
//import com.example.demo.model.myModel;
import java.sql.Timestamp;
@Repository
public class TravelDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final Logger logger = LoggerFactory.getLogger(TravelDAO.class);
	
	public void InsertintoPassenger(final TravelDetails trDetails) throws SQLException{
		logger.info("Inserting into passanger table " + trDetails.getName());
		//jdbcTemplate.set
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			//@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				PreparedStatement ps = con.prepareStatement(FligghtConstants.sql);
				//trDetails.setPassenger_id(1);
				//ps.setInt(1, trDetails.getPassenger_id());
				//ps.setString(1, trDetails.getPassenger_id());
				ps.setString(1, trDetails.getName());
				ps.setString(2, trDetails.getMname());
				ps.setString(3, trDetails.getLname());
				ps.setString(4, trDetails.getCountry());
				ps.setString(5, trDetails.getPhonenumber());
				//ps.setTimestamp(7, new Timestamp(trDetails.getDob().getTime()));
				
				
				ps.setString(6, trDetails.getGender());
				//ps.setTimestamp(7, new Timestamp(trDetails.getDob().getTime()));
				ps.setString(7, trDetails.getDob());
				ps.setString(8, trDetails.getCardholder());
				ps.setString(9, trDetails.getExDa());
				//ps.setTimestamp(9, new Timestamp(trDetails.getExDa().getTime()));
				ps.setString(10, trDetails.getSecurity());
				return ps;
			}
		});
	/*	jdbcTemplate.batchUpdate(FligghtConstants.sql, 
				new BatchPreparedStatementSetter() {
					
					@Override
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						// TODO Auto-generated method stub
						//TravelDetails trDetails = items.get(i);
						
						//Object pass_sequence;
						ps.setString(2, trDetails.getName());
						ps.setString(3, trDetails.getMname());
						ps.setString(4, trDetails.getLname());
						ps.setString(5, trDetails.getCountry());
						ps.setString(5, trDetails.getPhonenumber());
						//ps.setTimestamp(7, new Timestamp(trDetails.getDob().getTime()));
						
						
						ps.setString(6, trDetails.getGender());
						ps.setString(7, trDetails.getDob());
						ps.setString(8, trDetails.getCardholder());
						ps.setString(9, trDetails.getExDa());
						ps.setString(10, trDetails.getSecurity());
						
					}
					
					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return 0;
					}
				});*/
		
	}
	
	public void create(TravelDetails travel) {
		System.out.println("Inserting data"+ travel);
		int passenger_id= travel.getPassenger_id();
		String name = travel.getName();
		String mname = travel.getMname();
		String lname=travel.getLname();
		String country=travel.getCountry();
		String phonenumber=travel.getPhonenumber();
		String gender=travel.getGender();
		
		String dob=travel.getDob();
		String cardholder=travel.getCardholder();
		
		String ExDa=travel.getExDa();
		String security=travel.getSecurity();
	

		String sql="INSERT INTO HR.passenger (passenger_id,name,mname,lname,country,phonenumber, gender,dob,cardholder,ExDa,security) "
				+ "VALUES (pass_sequence.nextval,'"+name+"', '"+mname+"', '"+lname+"', '"+country+"', '"+phonenumber+"', '"+gender+"', '"+
				dob+"', '"+cardholder+"', '"+ExDa+"', '"+security+"')";
		System.out.println(phonenumber +" and "+ cardholder+" added");
		System.out.println("create person entity "+ sql);
		jdbcTemplate.update(sql);
		
	}

}
/*String name;
String mname;
String lname;
String country;
String phonenumber;
String gender;
String dob;
String cardholder;
String ExDa;
String security;*/
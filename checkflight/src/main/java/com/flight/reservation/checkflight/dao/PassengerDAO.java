package com.flight.reservation.checkflight.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

//import com.example.demo.constants.FligghtConstants;

import com.flight.reservation.checkflight.constants.PassengerConstants;
import com.flight.reservation.checkflight.dto.PassengerDTO;



public class PassengerDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final Logger logger = LoggerFactory.getLogger(PassengerDAO.class);
	public void InsertintoPassenger(final List<? extends PassengerDTO> items) throws SQLException{
		//logger.info("Inserting into passanger table " + passengerDTO.getName());
		jdbcTemplate.batchUpdate(PassengerConstants.sql,
				new BatchPreparedStatementSetter() {
					
					@Override
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						// TODO Auto-generated method stub
						PassengerDTO passengerDTO = items.get(i);
						logger.info("Inserting passenger to db "+ i+" with "+ passengerDTO.getPassenger_id());
						//ps.setLong(1, x);
						ps.setString(1, passengerDTO.getName());
						ps.setString(2, passengerDTO.getMname());
						ps.setString(3, passengerDTO.getLname());
						ps.setString(4, passengerDTO.getCountry());
						ps.setString(5, passengerDTO.getPhonenumber());
						//ps.setTimestamp(7, new Timestamp(trDetails.getDob().getTime()));
						
						
						ps.setString(6, passengerDTO.getGender());
						//ps.setTimestamp(7, new Timestamp(trDetails.getDob().getTime()));
						ps.setString(7, passengerDTO.getDob());
						ps.setString(8, passengerDTO.getCardholder());
						ps.setString(9, passengerDTO.getExDa());
						//ps.setTimestamp(9, new Timestamp(trDetails.getExDa().getTime()));
						ps.setString(10, passengerDTO.getSecurity());
						//return ps;
						
						
					}
					
					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return 0;
					}
				});
				
		
	}

}

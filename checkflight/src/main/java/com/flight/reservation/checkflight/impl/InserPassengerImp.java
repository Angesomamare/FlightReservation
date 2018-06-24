package com.flight.reservation.checkflight.impl;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.flight.reservation.checkflight.api.InsertPassenger;
import com.flight.reservation.checkflight.dao.PassengerDAO;
import com.flight.reservation.checkflight.dto.PassengerDTO;

public class InserPassengerImp implements InsertPassenger {
	private static final Logger log = LoggerFactory.getLogger(PassengerReaderServiceImpl.class);
	
	@Autowired
	private PassengerDAO passengerDAO;
	@Override
	public void insertPassengerInToPassengerTBL(List<? extends PassengerDTO> passengerList) throws SQLException{
		log.info("Calling Passenger DAO");
		passengerDAO.InsertintoPassenger(passengerList);
		log.info("Exit from DAO");
		
	}

}

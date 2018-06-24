package com.flight.reservation.checkflight.api;

import java.sql.SQLException;
import java.util.List;

import com.flight.reservation.checkflight.dto.PassengerDTO;

public interface InsertPassenger {
	
	public void insertPassengerInToPassengerTBL(List<? extends PassengerDTO> passengerList) throws SQLException;

}

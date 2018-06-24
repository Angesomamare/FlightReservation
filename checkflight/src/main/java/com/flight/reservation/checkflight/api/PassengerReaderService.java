package com.flight.reservation.checkflight.api;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.core.io.Resource;

import com.flight.reservation.checkflight.dto.PassengerDTO;

public interface PassengerReaderService {
	
	public List<PassengerDTO> readPassengerXlsRecords(Resource resource)  
			throws IOException,SecurityException,IllegalAccessException,InvocationTargetException;

}

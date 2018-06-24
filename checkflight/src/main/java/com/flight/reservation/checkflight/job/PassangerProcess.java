package com.flight.reservation.checkflight.job;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.flight.reservation.checkflight.dto.PassengerDTO;

@Component
public class PassangerProcess {
	private static final Logger log = LoggerFactory.getLogger(PassangerProcess.class);
	
	private List<PassengerDTO> excelDTOList = new ArrayList<>();
	
	@Value("${app.passengerLocation}")
	private String path;
	
	
}

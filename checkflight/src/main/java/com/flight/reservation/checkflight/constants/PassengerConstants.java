package com.flight.reservation.checkflight.constants;

public class PassengerConstants {
	public static final int SHEET_NUMBER_TO_BE_PROCESSED=0;
	public static final String sql="INSERT INTO HR.passenger (passenger_id,name,mname,lname,country,phonenumber, gender,dob,cardholder,ExDa,security) values (pass_sequence.nextval,?,?,?,?,?,?,TO_DATE(?, 'MM-DD-YYYY','NLS_DATE_LANGUAGE = American') ,?,TO_DATE(?, 'MM-DD-YYYY','NLS_DATE_LANGUAGE = American') ,?)";
	
}

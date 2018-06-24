package com.example.demo.constants;

public class FligghtConstants {
	public static final String sql="INSERT INTO HR.passenger (passenger_id,name,mname,lname,country,phonenumber, gender,dob,cardholder,ExDa,security) values (pass_sequence.nextval,?,?,?,?,?,?,TO_DATE(?, 'MM-DD-YYYY','NLS_DATE_LANGUAGE = American') ,?,TO_DATE(?, 'MM-DD-YYYY','NLS_DATE_LANGUAGE = American') ,?)";
}
//pass_sequence.nextval
//passenger_id,
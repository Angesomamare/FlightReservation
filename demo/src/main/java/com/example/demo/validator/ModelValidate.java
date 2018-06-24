package com.example.demo.validator;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ValidationException;

import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;

import com.example.demo.model.myModel;


@Component
public class ModelValidate {
	public List<String> errorList = new ArrayList<>();


	public void validate(myModel item) throws ValidationException{

		errorList = validateField("Name", item.getName(), true, 20,errorList);
		errorList = validateField("Age", item.getAge(), true, 20,errorList);
		String x = Integer.toString(98);

	}
	
	private List<String> validateField(String FieldName, String FieldValue,boolean nullCheck, int FieldLength,List<String> errorList){
		
		if(nullCheck) {
			if(null==FieldValue || "".equals(FieldValue)||"null".equalsIgnoreCase(FieldValue)) {
				String errormessage = FieldName + " Can not be null ";
				//System.out.println(errormessage);
				errorList.add(errormessage);
				}
		}
		if (0!=FieldLength) {
			if(FieldValue !=null && FieldValue.length()>FieldLength) {
				String errormessage = FieldName + " cannot be greater than "+ FieldLength;
				errorList.add(errormessage);
			}
		}
		
		return errorList;
	}

}

package com.example.demo.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.demo.model.Person;

@Component
public class PersonValidator implements Validator {
	 @Override
	   public boolean supports(Class<?> clazz) {
	      return Person.class.equals(clazz);
	   }
	 @Override
	   public void validate(Object obj, Errors err) {

	      ValidationUtils.rejectIfEmpty(err, "name", "person.name.empty");
	      ValidationUtils.rejectIfEmpty(err, "email", "person.email.empty");
	      ValidationUtils.rejectIfEmpty(err, "gender", "pesron.gender.empty");
	      ValidationUtils.rejectIfEmpty(err, "lang", "person.lang.empty");

	      Person person = (Person) obj;

	      Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
	            Pattern.CASE_INSENSITIVE);
	      if (!(pattern.matcher(person.getEmail()).matches())) {
	         err.rejectValue("email", "person.email.invalid");
	      }

	   }
}

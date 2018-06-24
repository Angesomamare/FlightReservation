package com.example.demo.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Person;
import com.example.demo.validator.PersonValidator;

@Controller
public class PersonController {
	@Autowired
	   private PersonValidator personValidator;
	   
	   @InitBinder
	   protected void initBinder(WebDataBinder binder) {
	      binder.addValidators(personValidator);
	   }

	   @GetMapping("/home")
	   public String userForm(Locale locale,Model model) {
	      model.addAttribute("person", new Person());
	      return "personForm";
	   }

	   /*
	    * Save user object
	    */
	   @PostMapping("/home")
	   public String saveUser(@ModelAttribute("person") @Validated Person user, BindingResult result,
	         Model model) {

	      if (result.hasErrors()) {
	         return "personForm";
	      }
	      return "succes";
	   }

}

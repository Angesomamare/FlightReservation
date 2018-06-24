package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.Mdao;
import com.example.demo.model.TravelDetails;
import com.example.demo.model.myModel;
import com.example.demo.validator.ModelValidate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private Mdao d;
	
	@Autowired
	private ModelValidate mv;
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)

	public String Create(Model m) {
		//@ModelAttribute ("myModel") myModel myModel,Model model
		// myModel md = new myModel();
		//md.setName("Angesom");
		//model.addAttribute("name", md.getName());
		
		logger.info("Getting form");
		m.addAttribute("myModel", new myModel());
		return "index";
	}
	
/*	@RequestMapping(value="/", method=RequestMethod.POST)
	public String getName(@ModelAttribute ("person") myModel m,BindingResult result,Model model) {
		logger.info("checking data");
		mv.validate(m);
		if(mv.errorList.size()>0) {
			logger.info(mv.errorList.toString());
			return "index";
		}

		
		if(result.hasErrors()) {
			logger.info(m +" is not able to be inserted");
			return "index";
		}
		d.create(m);
		logger.info("Inserting "+ m +" into db");
		model.addAttribute("name", m.getName());
		model.addAttribute("age", m.getAge());
		return "result";
		
	}*/
	

}

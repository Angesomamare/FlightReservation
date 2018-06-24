package com.example.demo.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.TravelDAO;
import com.example.demo.model.FlightDetail;
import com.example.demo.model.TravelDetails;
import com.example.demo.validator.ModelValidate;

@Controller
public class FlightController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@Autowired
	private TravelDAO trdao;
/*	
	@RequestMapping(value="/flight", method = RequestMethod.GET)
	public String getFlight(Model model) {

		logger.info("Getting Flight form");
		
		model.addAttribute("flightdetail", new FlightDetail());
		return "flight";
	}*/
	
	@RequestMapping(value="/home2", method = RequestMethod.GET)
	public String getFlight2(Model model) {

		logger.info("Getting Flight form");
		
		model.addAttribute("flightdetail", new FlightDetail());
		return "home";
	}
/*	@RequestMapping(value="/flight", method=RequestMethod.POST)
	public String getName(@ModelAttribute ("flightdetail") FlightDetail flightdetail,BindingResult result,Model model) {
		
	      if (result.hasErrors()) {
		         return "flight";
		      }
		      return "ok";
		
	}*/
	@RequestMapping(value="/test", method = RequestMethod.GET)

	public String test(Model m) {
		//@ModelAttribute ("myModel") myModel myModel,Model model
		// myModel md = new myModel();
		//md.setName("Angesom");
		//model.addAttribute("name", md.getName());
		
		logger.info("Getting form");
		m.addAttribute("mytravel", new TravelDetails());
		return "flight";
	}
	
	
	@RequestMapping(value="/test", method=RequestMethod.POST)
	public String addpassenger(@ModelAttribute ("mytravel") TravelDetails travel,BindingResult result,Model model) {
		
		if(result.hasErrors()) {
			logger.info(travel +" is not able to be inserted");
			return "flight";
		}
		try {
			trdao.InsertintoPassenger(travel);
			logger.info("Inserting "+ travel +" into db");
			
			model.addAttribute("name", travel.getName());
			model.addAttribute("lastname", travel.getLname());
			return "result";
		}
		catch (SQLException e) {
			System.out.println("Error found: "+e);
			return "flight";
			// TODO: handle exception
		}
	/*	List<TravelDetails> ltravel=new ArrayList<>();
		ltravel.add(travel);*/
		//trdao.InsertintoPassenger(ltravel);
		//trdao.InsertintoPassenger(travel);
		/*trdao.create(travel);*/
/*		d.create(m);*/
	
		
	}
	@RequestMapping(value="/terms", method = RequestMethod.GET)
	public String terms() {
		return "terms";
	}
	@RequestMapping(value="/contacts", method = RequestMethod.GET)
	public String contacts() {
		return "contact";
	}
	@RequestMapping(value="/hotel", method = RequestMethod.GET)
	public String hotel() {
		return "hotel";
	}
	@RequestMapping(value="/enterprise", method = RequestMethod.GET)
	public String enterprise() {
		return "enterprise";
	}
	@RequestMapping(value="/kayaka", method = RequestMethod.GET)
	public String kayaka() {
		return "kayaka";
	}
	@RequestMapping(value="/sevendays", method = RequestMethod.GET)
	public String Sevendays() {
		return "sevendays";
	}
	
}

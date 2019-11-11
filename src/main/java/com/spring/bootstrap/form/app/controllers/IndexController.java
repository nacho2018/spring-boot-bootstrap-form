package com.spring.bootstrap.form.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bootstrap.form.app.models.Company;

@Controller
public class IndexController {
	
	@Autowired
	private Company company;

	@GetMapping({"/", "/index", "/form"})
	public ModelAndView goToForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("title","Welcome to Sand Diego Torrent L.S!");
		mav.addObject("name", company.getName());
		mav.addObject("foundationYear",company.getFoundationYear());
		mav.addObject("numEmployees", company.getEmployees().toString());
		mav.addObject("ownerName", company.getOwner());
		mav.addObject("locations", company.getLocations());
		mav.setViewName("company/form");
		
		return mav;
		
		
	}
	
	
}

package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	//need a controller method to show inital form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controller method to read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShout(HttpServletRequest request, Model model) {
		//read the request parameter from the html form
		String theName = request.getParameter("studentName");
		
		//convert to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hello! " + theName;
		
		//add message to model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	//request binding example
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		//convert to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hey! " + theName;
		
		//add message to model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
}

package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	//create method to show form
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//Create a new student obj
		Student theStudent = new Student();
		
		//add the student obj as a model attribute
		theModel.addAttribute("student",theStudent);
		return "student-form";
	}
}

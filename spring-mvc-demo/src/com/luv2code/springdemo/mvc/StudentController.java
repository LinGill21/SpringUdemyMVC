package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student")Student theStudent) {
		//log the input
		System.out.println("The student "+theStudent.getFirstName() + theStudent.getLastName());
		return "student-confirmation";
	}
}

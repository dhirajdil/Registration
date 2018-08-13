package com.diksha.registration;

import com.diksha.registration.Service.*;

import javassist.SerialVersionUID;

import com.diksha.registration.Service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class RegistrartionController {
	
	@Autowired
	StudentServiceImplemention studentservice;
	
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");

	      return "register";
	   
		}
	@RequestMapping(value="/student",method = RequestMethod.GET)
	public String showStudentForm(ModelMap model) {
		model.addAttribute("message", "welcome in student portal");
						return "student";
						}
	
	 @RequestMapping(value="/addStudent",method=RequestMethod.POST)
	  public  String addstudent(@ModelAttribute("SpringWeb") Student stu, ModelMap model) {
		model.addAttribute("id", stu.getId()); 
		model.addAttribute("name", stu.getName());
		model.addAttribute("age", stu.getAge());
		
		studentservice.addStudent(stu);
		
		return "result";
		
	 }
	
}


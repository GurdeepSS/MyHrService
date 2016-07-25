package com.rohini.myhrservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	
	@RequestMapping("/taskhome")
	public String taskHome() {
		return "task_index";
	}

}

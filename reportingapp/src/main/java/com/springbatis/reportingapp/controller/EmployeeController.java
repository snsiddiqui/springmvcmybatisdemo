package com.springbatis.reportingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbatis.reportingapp.domain.Employee;
import com.springbatis.reportingapp.orm.EmployeeMapper;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@GetMapping("/Employee")
	public String greeting(@RequestParam(name="id", required=false) Integer id, Model model) {
		Employee employee = id != null ? employeeMapper.findById(id) : employeeMapper.getEmployee();
		model.addAttribute("result", employee);
		return "test";
	}

}

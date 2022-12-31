package com.example.empapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.empapi.model.Employee;
import com.example.empapi.services.EmpService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmpController {
	
	
	@Autowired
	private final EmpService empService;
	
	public EmpController(EmpService empService)
	{
		this.empService=empService;
	}
	
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee)
	{
	
		return empService.createEmployee(employee);
	}
	@GetMapping("/employees")
	public List<Employee> getAllEmp()
	{
		
		
		
		return empService.getAllEmp();
	}
	

}

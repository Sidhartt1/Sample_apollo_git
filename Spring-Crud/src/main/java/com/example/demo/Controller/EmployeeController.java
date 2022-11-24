package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

//to check merge


public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/employees")
	public void addEmployees(@RequestBody Employee employee){
		employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employees/{id}")
	public void updateEmployee(@RequestBody Employee e, @PathVariable int id){
		employeeService.updateEmployee(e, id);
	}
	
	

}
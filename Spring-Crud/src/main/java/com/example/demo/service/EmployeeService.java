package com.example.demo.service;


import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

public class EmployeeService {
	
	private EmployeeDao employeedao;
	
	public void addEmployee(Employee e) {
		employeedao.save(e);

	}
	
	public void updateEmployee(Employee emp, int id){
		if(id == emp.getEmpid()) {
			employeedao.save(emp);
		}
	}

}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DepartmentRepo;
import com.example.demo.model.Department;

@Service
public class DepartmentService
{
	
	@Autowired
	private static DepartmentRepo repo;

	public void createDepartment(Department department) 
	{
		repo.save(department);
	}

	public Department updateDepartment(Department department, int depId)
	{
		Department expectedDepartment = repo.findById(depId).get();
		if(expectedDepartment != null)
		{
			expectedDepartment.setDepName(department.getDepName());
			repo.save(expectedDepartment);
			return expectedDepartment;
		}
		return null;
		
	}
	
	public static List<Department> getAllDepartments() {
		List<Department> depList = null;
		
		depList = repo.findAll();
	
	return depList;
	}

	public static Department getdepById(Integer departmentidL) {
		return repo.findById(departmentidL).get();
	}
	
}
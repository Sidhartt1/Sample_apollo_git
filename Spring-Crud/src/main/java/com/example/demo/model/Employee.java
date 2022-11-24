package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int empid;
	private String ename;
	public Employee(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + "]";
	}

}

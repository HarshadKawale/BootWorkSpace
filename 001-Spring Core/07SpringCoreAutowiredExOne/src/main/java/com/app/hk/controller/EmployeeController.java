package com.app.hk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.hk.service.EmployeeService;

@Component
public class EmployeeController {
	
	@Autowired
	private EmployeeService empservice;

	public EmployeeController() {
		super();
	}

	public EmployeeService getEmpservice() {
		return empservice;
	}

	public void setEmpservice(EmployeeService empservice) {
		this.empservice = empservice;
	}

	@Override
	public String toString() {
		return "EmployeeController [empservice=" + empservice + "]";
	}
	
	
	

}

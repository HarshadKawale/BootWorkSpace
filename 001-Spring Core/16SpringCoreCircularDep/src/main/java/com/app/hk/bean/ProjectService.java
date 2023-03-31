package com.app.hk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectService {

	@Autowired
	public EmployeeService employeeService;

	public ProjectService() {
		super();
		System.out.println("Called ProjectService Default Constructor ");
	}
	
	public ProjectService(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
		System.out.println("Called ProjectService Parametrerised Constructor ");
	}

	@Override
	public String toString() {
		return "ProjectService [employeeService=" + employeeService + "]";
	}

	public EmployeeService getEmployeeService() {
		
		System.out.println("Called getEmployeeService");
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		
		System.out.println("Called setEmployeeService");
		this.employeeService = employeeService;
	}
	
	
}

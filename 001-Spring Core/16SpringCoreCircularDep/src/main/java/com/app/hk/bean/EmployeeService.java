package com.app.hk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	@Autowired
	public ProjectService projectService;

	public EmployeeService() {
		super();
		System.out.println("Called EmployeeService Default Constructor ");
	}

	public EmployeeService(ProjectService projectService) {
		super();
		this.projectService = projectService;
		System.out.println("Called EmployeeService Parametrerised Constructor ");
	}

	public ProjectService getProjectService() {
		System.out.println("Called getProjectService");
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		System.out.println("Called setProjectService");
		this.projectService = projectService;
	}
	
	
}

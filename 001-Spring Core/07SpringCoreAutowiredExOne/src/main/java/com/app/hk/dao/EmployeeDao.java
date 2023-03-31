package com.app.hk.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	@Value("Harshad")
	private String empName;
	
	@Value("300000")
	private String empSal;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSal() {
		return empSal;
	}

	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}

	public EmployeeDao() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeDao [empName=" + empName + ", empSal=" + empSal + "]";
	}

}

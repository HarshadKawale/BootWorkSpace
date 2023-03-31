package com.app.hk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.hk.dao.EmployeeDao;

@Component
public class EmployeeService {

	@Autowired
	private EmployeeDao empdao;

	public EmployeeService() {
		super();
	}

	public EmployeeDao getEmpdao() {
		return empdao;
	}

	public void setEmpdao(EmployeeDao empdao) {
		this.empdao = empdao;
	}

	@Override
	public String toString() {
		return "EmployeeService [empdao=" + empdao + "]";
	}
	
	
	
	
}

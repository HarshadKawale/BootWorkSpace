package com.app.hk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.hk.config.Appconfig;
import com.app.hk.controller.EmployeeController;

public class Apptest {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		EmployeeController empcon = ac.getBean("employeeController", EmployeeController.class);
		System.out.println(empcon);
	}

}

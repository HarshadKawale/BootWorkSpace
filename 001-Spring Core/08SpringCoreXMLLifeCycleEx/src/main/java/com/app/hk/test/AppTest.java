package com.app.hk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.hk.bean.ExcelExport;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		ExcelExport eobj = ac.getBean("excObj",ExcelExport.class);
		System.out.println(eobj);
		((AbstractApplicationContext) ac).close();
		

	}

}

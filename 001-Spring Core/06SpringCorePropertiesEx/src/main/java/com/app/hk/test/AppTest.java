package com.app.hk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.hk.bean.DatabaseCon;
import com.app.hk.config.AppConfig;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac =new AnnotationConfigApplicationContext(AppConfig.class);
		DatabaseCon db = ac.getBean("dbcon",DatabaseCon.class);
		System.out.println(db);
	}

}

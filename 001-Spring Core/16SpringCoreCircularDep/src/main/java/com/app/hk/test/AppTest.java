package com.app.hk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.hk.bean.ProjectService;
import com.app.hk.config.AppConfig;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ProjectService pObj = ac.getBean("projectService",ProjectService.class);
		System.out.println(pObj);

	}

}

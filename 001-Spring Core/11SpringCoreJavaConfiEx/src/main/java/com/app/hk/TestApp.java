package com.app.hk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ExportPDF ee = ac.getBean("expdfobj",ExportPDF.class);
		System.out.println("FROM MAIN");
		System.out.println(ee);
		//ac.registerShutdownHook(); //old-style
		ac.close();
	}

}

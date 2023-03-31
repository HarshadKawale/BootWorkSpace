package com.app.hk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppJavaConfig.class);
		PdfExport acc = ac.getBean("pdfobj", PdfExport.class);
		System.out.println(acc);
	}

}

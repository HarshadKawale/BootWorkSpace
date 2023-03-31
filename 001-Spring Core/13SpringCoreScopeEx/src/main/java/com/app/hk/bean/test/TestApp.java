package com.app.hk.bean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.hk.bean.Product;

public class TestApp {

	public static void main(String[] args) {

		System.out.println("Before Container creation");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println("After Container creation");

		Product pobj1 = ac.getBean("product", Product.class);

		System.out.println(pobj1.hashCode());

		Product pobj2 = ac.getBean("product", Product.class);

		System.out.println(pobj2.hashCode());
	}

}

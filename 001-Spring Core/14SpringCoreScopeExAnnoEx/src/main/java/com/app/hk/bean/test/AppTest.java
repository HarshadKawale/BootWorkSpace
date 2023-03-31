package com.app.hk.bean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.hk.bean.Token;
import com.app.hk.bean.config.Appconfig;

public class AppTest {

	public static void main(String[] args) {

		System.out.println("Before Container creation");
		ApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.println("After Container creation");
		Token tkobj1 = ac.getBean("token", Token.class);

		System.out.println("Hash Code is :"+tkobj1.hashCode());

		Token tkobj2 = ac.getBean("token", Token.class);

		System.out.println("Hash Code is :"+tkobj2.hashCode());

	}

}

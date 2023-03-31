package com.app.hk.bean;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Token {

	private int token;

	public Token() {
		super();
		
		token = new Random().nextInt(9999);
		
		System.out.println("FROM CONSTRCUTOR"+":"+token);
	}

	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}

	public Token(int token) {
		super();
		this.token = token;
	}
	
	
	
}

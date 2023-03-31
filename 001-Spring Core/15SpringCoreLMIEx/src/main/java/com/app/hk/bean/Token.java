package com.app.hk.bean;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Token {

	public int tokenId;

	public Token() {
		super();
		tokenId = new Random().nextInt();
	}

	@Override
	public String toString() {
		return "Token [tokenId=" + tokenId + "]";
	}
	
	
}

package com.app.hk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TokenService {

	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}

	@Autowired
	public Token token;

	
	
	@Lookup
	public Token linkNewObj() {
		
		return null;
	}
	
	
	public Token getTokenOb() {
		
		this.token=linkNewObj();
		return token;
	}
	
}

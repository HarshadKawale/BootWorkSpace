package com.app.hk.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbcon")
public class DatabaseCon {

	@Value("${mycon.url}")
	private String url;
	
	@Value("${mycon.driver}")
	private String driver;
	
	@Value("${mycon.username}")
	private String username;
	
	@Value("${mycon.password}")
	private String password;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public DatabaseCon() {
		super();
	}

	@Override
	public String toString() {
		return "DatabaseCon [url=" + url + ", driver=" + driver + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	
	
}

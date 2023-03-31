package com.app.hk.bean;

import java.util.Random;

public class Product {

	private int id;
	private String name;

	public Product() {
		super();
		System.out.println("Constructor is called");

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

}

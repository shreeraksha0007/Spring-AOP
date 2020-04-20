package com.shreeraksha.Spring_AOP;

public class CustomerService {
	String name;
	String url;

	public void printName() {
		System.out.println("Customer Name: " + name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printUrl() {
		System.out.println("Customer url " + url);
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "CustomerService [name=" + name + ", url=" + url + "]";
	}

}

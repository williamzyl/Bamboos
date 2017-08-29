package com.zeratul;

public class Info {
	private String name;

	public Info(){
		
	}
	
	public Info(String name) {
		System.out.println("constructor"+" --- name is :"+name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printName(){
		System.out.println("My name is "+this.name);
	}
	
}

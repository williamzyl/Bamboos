package com.zeratul;

public abstract class Person {
	
	
	private String name;
	
	private String firstName;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public abstract void printSelf();
	
}

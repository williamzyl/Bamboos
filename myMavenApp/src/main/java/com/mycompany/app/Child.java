package com.mycompany.app;

public class Child extends Parent{
	private String lastName;

	@Override
	public void printFristName() {
		System.out.println(this.getFristName()+"----"+this.lastName);
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}

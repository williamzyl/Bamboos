package com.zeratul;

public class Person {
	
	private int idCard;
	private String name;
	
	
	public Person() {
		
	}


	public Person(int idCard, String name) {
		this.idCard = idCard;
		this.name = name;
	}


	public int getIdCard() {
		return idCard;
	}


	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Person [idCard=" + idCard + ", name=" + name + "]";
	}
	
	
	
	
	
}

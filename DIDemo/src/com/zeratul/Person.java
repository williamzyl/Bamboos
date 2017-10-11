package com.zeratul;

public class Person {
	
	private int idCard;
	private String name;
	private boolean student;
	private Computer computer;
	
	
	
	public Person() {
		
	}


	public Person(int idCard, String name) {
		System.out.println("construct"+System.currentTimeMillis());
		this.idCard = idCard;
		this.name = name;
	}

	
	

	public Person(int idCard, String name, boolean student) {
		this.idCard = idCard;
		this.name = name;
		this.student = student;
	}

	
	

	public Person(int idCard, String name, boolean student, Computer computer) {
		super();
		this.idCard = idCard;
		this.name = name;
		this.student = student;
		this.computer = computer;
	}


	public boolean isStudent() {
		return student;
	}


	public void setStudent(boolean student) {
		this.student = student;
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


	
	
	public Computer getComputer() {
		return computer;
	}


	public void setComputer(Computer computer) {
		this.computer = computer;
	}


	@Override
	public String toString() {
		return "Person [idCard=" + idCard + ", name=" + name + ", student=" + student + ", computer=" + computer + "]";
	}


	
	
	
}

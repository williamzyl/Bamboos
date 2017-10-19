package com.zeratul;

public   class Employee extends Person {
	
	private static String position;
	

	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	
	



	@Override
	public String toString() {
		return "Employee [getPosition()=" + getPosition() + ", getName()=" + getName() + ", getFirstName()="
				+ getFirstName() +"]";
	}



	@Override
	public void printSelf() {
		System.out.println("I'm Employee in"+this.position);
	}

}

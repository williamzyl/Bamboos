package com.daisy;

public class RealCoder implements ICoder {

	private String name;
	
	
	
	public RealCoder(String name) {
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void implDemands(String demandsname) {
		System.out.println(this.name+" implement the demands:"+demandsname);

	}

}

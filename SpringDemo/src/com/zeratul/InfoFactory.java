package com.zeratul;

public class InfoFactory {
	
	public  Info newInstance(String name) {
		System.out.println("new Instance");
		return  new Info(name);
	}

}

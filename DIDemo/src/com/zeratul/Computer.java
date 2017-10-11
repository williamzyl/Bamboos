package com.zeratul;

public class Computer {
	
	private String version;
	private String brand;
	
	
	
	public Computer() {
	}
	public Computer(String version, String brand) {
		this.version = version;
		this.brand = brand;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	@Override
	public String toString() {
		return "Computer [version=" + version + ", brand=" + brand + "]";
	}
	
	
	
	
	
	

}

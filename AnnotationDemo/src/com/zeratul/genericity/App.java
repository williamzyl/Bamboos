package com.zeratul.genericity;

public class App {

	public static void main(String[] args) {
		Box<Number> number=new Box<Number>(12);
		Box<Integer> integer=new Box<Integer>(32);
		Box<String> str=new Box<String>("Zeratul");
		Box<Object> obj=new Box<Object>(60);
		
		printData(integer);
		printData(number);
//		printData(str);
//		printData(obj);
	}
	
	
	public static void printData(Box<? extends Number> box){
		System.out.println(box.getData());
	}

}

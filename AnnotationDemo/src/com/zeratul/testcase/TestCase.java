package com.zeratul.testcase;


public class TestCase {
	
	@TestableException(ArithmeticException.class)
	public  void test1(){
		System.out.println("test1");
	}
	
	@TestableException(ArithmeticException.class)
	public void test2() throws Exception{
		int i=1/0;
		System.out.println(i);
		System.out.println("test2 ");
	}
	@TestableException(ArithmeticException.class)
	public void test3() throws ArithmeticException {
		System.out.println("test3");
		throw new ArithmeticException("test3 throw an error");
	}
	
	@TestableException(ArithmeticException.class)
	public  void test4(){
		System.out.println("test4");
	}
	
	@TestableException(ArithmeticException.class)
    public void test5() {
        System.out.println("test5");
    }
  
	@Testable
    public void test6() {
        System.out.println("test6");
    }
	
}

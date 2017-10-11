package com.zeratul;

public class LogAspect{
	
	

	public void beforeAdvice(String param){
	
		System.out.println("video starts playing"+"--now :"+System.currentTimeMillis());
		System.out.println("before param :"+param);
	}
	
	public void afterFinallyAdvice(String param){
		System.out.println("video isplaying"+"--now :"+System.currentTimeMillis());
		System.out.println("after param :"+param);
	}

}

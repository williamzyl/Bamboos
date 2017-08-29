package com.daisy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CoderDynamicProxy implements InvocationHandler {

	
	private ICoder iCoder;
	
	
	public CoderDynamicProxy(ICoder iCoder) {
		this.iCoder = iCoder;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		 System.out.println(System.currentTimeMillis());
	     Object result = method.invoke(iCoder, args);
	     System.out.println(System.currentTimeMillis());
	     
	     return result;
	}

}

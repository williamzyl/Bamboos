package com.daisy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Customer {

	public static void main(String[] args) {
		ICoder coder=new RealCoder("william");
//		CoderProxy proxy=new CoderProxy(coder);
//		proxy.implDemands("Add user managemnet.");
		
		
		InvocationHandler handler=new CoderDynamicProxy(coder);
		
		 //获取类加载器
        ClassLoader cl = coder.getClass().getClassLoader();
        //动态产生一个代理类
        ICoder proxy = (ICoder) Proxy.newProxyInstance(cl, coder.getClass().getInterfaces(), handler);
        //通过代理类，执行doSomething方法；
        proxy.implDemands("Modify user management");
		
		
		
	}

}

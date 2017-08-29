package com.daisy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Customer {

	public static void main(String[] args) {
		ICoder coder=new RealCoder("william");
//		CoderProxy proxy=new CoderProxy(coder);
//		proxy.implDemands("Add user managemnet.");
		
		
		InvocationHandler handler=new CoderDynamicProxy(coder);
		
		 //��ȡ�������
        ClassLoader cl = coder.getClass().getClassLoader();
        //��̬����һ��������
        ICoder proxy = (ICoder) Proxy.newProxyInstance(cl, coder.getClass().getInterfaces(), handler);
        //ͨ�������ִ࣬��doSomething������
        proxy.implDemands("Modify user management");
		
		
		
	}

}

package com.zeratul;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("main"+System.currentTimeMillis());
		BeanFactory context=new ClassPathXmlApplicationContext("Bean.xml");
		System.out.println("over"+System.currentTimeMillis());
		Person p=(Person) context.getBean("zeratul");
		System.out.println(p);
	}

}

package com.zeratul;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		BeanFactory context=new ClassPathXmlApplicationContext("Bean.xml");
		Person p=(Person) context.getBean("byName");
		System.out.println(p);
	}

}

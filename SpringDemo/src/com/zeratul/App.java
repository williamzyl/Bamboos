package com.zeratul;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		BeanFactory  context = new ClassPathXmlApplicationContext("Bean.xml");
//		Info info=(Info) context.getBean("info");
//		info.printName();

		Info info=(Info) context.getBean("infoBean",Info.class);
		info.printName();
	}

}

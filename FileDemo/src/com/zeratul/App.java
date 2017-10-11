package com.zeratul;

import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext  context=new ClassPathXmlApplicationContext("bean.xml");
		context.registerShutdownHook();
		
		DependentBean depend=(DependentBean) context.getBean("dependbean");
		try {
			depend.write("sss");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

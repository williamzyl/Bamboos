package com.zeratul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args)  {
	
	  ApplicationContext ctx =  new ClassPathXmlApplicationContext("config.xml");  
	  PlayService playService =  
     ctx.getBean("playservice", PlayService.class);  
//	  playService.Play("video"); 
//	  playService.Pause("pause");
	  playService.feedback("like");
//		try {
//			playService.seek(90);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	
	}

}

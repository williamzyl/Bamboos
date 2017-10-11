package com.zeratul.testcase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class TestableProcessor {

	public  static void process(String clazz) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		int passed=0;
		int failed=0;
		int warnings=0;
		Object obj=Class.forName(clazz).newInstance();
		for(Method method:Class.forName(clazz).getMethods()){
			 if (method.isAnnotationPresent(TestableException.class)) {
	                try {
	                    method.invoke(obj);
	                    ++passed;
	                } catch (IllegalAccessException | InvocationTargetException e) {
	                	
	                	Throwable cause=e.getCause();
	                	int oldPassed=passed;
	                	for(Class excType:method.getAnnotation(TestableException.class).value()){
	                		if(excType.isInstance(cause)){
	                			passed++;
	                			warnings++;
	                			break;
	                		}
	                	}
	                	
	                	if(oldPassed==passed){
	                		failed++;
	                		 System.out.printf("Test <%s> failed <%s> %n", method, e);
	                		//System.out.println("method " + method.getName() + " execute error: < " + e.getCause() + " >");
	                	}
	                	
//	                    e.printStackTrace(System.out);
	                }
	            }
		}
		 System.out.println("共运行" + (failed + passed) + "个方法, 成功" + passed + "个, 失败" + failed + "个 , 捕获期望异常："+warnings+"个");
		
	}
	
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		TestableProcessor.process("com.zeratul.testcase.TestCase");
	}
}

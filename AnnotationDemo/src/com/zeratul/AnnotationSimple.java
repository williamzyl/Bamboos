package com.zeratul;

import java.io.FileNotFoundException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AnnotationSimple {

	public static void main(String[] args) {
		try{
			for(Method method:AnnotationSimple.class.getClassLoader().loadClass("com.zeratul.AnnotationSimple").getMethods()){
				
				if(method.isAnnotationPresent(com.zeratul.MethodInfo.class)){
					
					for(Annotation anno:method.getDeclaredAnnotations()){
						
						System.out.println("Annotation in method "+method+':'+anno);
					
					}
					
					MethodInfo info=method.getAnnotation(com.zeratul.MethodInfo.class);
					if(info.revision()==1){
						System.out.println(" Method with revision no 1 ="+method);
					}
				
				}
			
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	@MethodInfo(author = "Zeratul", comments = "Main method", date = "Nov 17 2012", revision = 1)
	public String toString() {
	    return "Overriden toString method";
	}
	 
	@Deprecated
	@MethodInfo(comments = "deprecated method", date = "Nov 17 2012")
	public static void oldMethod() {
	    System.out.println("old method, don't use it.");
	}
	 
	@SuppressWarnings({ "unchecked", "deprecation" })
	@MethodInfo(author = "Zeratul", comments ="Main method", date ="Nov 17 2012", revision = 10)
	public static void genericsTest() throws FileNotFoundException {
	    List l = new ArrayList();
	    l.add("abc");
	    oldMethod();
	}
}

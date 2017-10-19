package com.zeratul;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		
		Class c=Class.forName("com.zeratul.Employee");
		Class superC=c.getSuperclass();
		Field f=c.getDeclaredField("position");
		System.out.println(f);
		Object o=c.newInstance();
		
		f.setAccessible(true);
		f.set(o, "programmer");
		System.out.println(f.get(o));
		
		Field namef=superC.getDeclaredField("name");
		System.out.println(namef);
		namef.setAccessible(true);
		namef.set(o, "Zeratul");
		System.out.println(namef.get(o));
		System.out.println(o);
	
//		Field[] fs=c.getDeclaredFields();
//		
//		StringBuffer sb=new StringBuffer();
//		
//		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
//
//		for(Field f:fs){
//			sb.append("\t");
//			sb.append(Modifier.toString(f.getModifiers())+" ");//获得属性的修饰符，例如public，static等等  
//            sb.append(f.getType().getSimpleName() + " ");//属性的类型的名字  
//            sb.append(f.getName()+";\n");//属性的名字+回车  
//		}
//		
//		sb.append("}");
//		
//		System.out.println(sb);
	}
}

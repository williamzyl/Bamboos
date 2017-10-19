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
//			sb.append(Modifier.toString(f.getModifiers())+" ");//������Ե����η�������public��static�ȵ�  
//            sb.append(f.getType().getSimpleName() + " ");//���Ե����͵�����  
//            sb.append(f.getName()+";\n");//���Ե�����+�س�  
//		}
//		
//		sb.append("}");
//		
//		System.out.println(sb);
	}
}

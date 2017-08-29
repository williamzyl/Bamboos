package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Parent parent=new Child();
    	Child child=(Child)parent;
    	
    	child.printFristName();
        
    }
}

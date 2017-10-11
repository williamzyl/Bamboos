package com.zeratul.join01;

public class MainThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" start");
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2(t1);
		
		
		
		try {
			t1.start();
			Thread.sleep(2000);
			t2.start();
			t2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"  end");
		
	}

}

package com.zeratul.join01;

public class MyThread2 extends Thread {
	
	MyThread1 t1;
	
	
	
	public MyThread2(MyThread1 t1) {
		this.t1 = t1;
	}



	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" start");
		try {
			t1.join();
			System.out.println(Thread.currentThread().getName()+" end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}

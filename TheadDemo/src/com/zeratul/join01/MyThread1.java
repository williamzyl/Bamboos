package com.zeratul.join01;

public class MyThread1 extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"  start");
		try {
			for(int i=0;i<10;i++){
				System.out.println(Thread.currentThread().getName()+"  lop at "+i);
				Thread.sleep(1000);
			}
			System.out.println(Thread.currentThread().getName()+" end ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		
		
	}

}

package com.zeratul;

public class App {

	public static void main(String[] args) {
//		final Thread t=new Thread(new MyThead());
//		Thread t2=new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				try {
//					t.join();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				for(int i=0;i<20;i++){
//					System.out.println("thread 2 :"+i);
//				}
//				
//			}
//		});
//		
//		t.start();
//		t2.start();
//		try {
//			t.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		for(int i=0;i<20;i++){
//			
//			System.out.println("main :"+i);
//		}
		
		
		
		SleepThread sleepThread=new SleepThread();
		Thread t=new Thread(sleepThread);
		
		t.start();
		
		try {
			t.join(1000);
			
			System.out.println("main  say");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}

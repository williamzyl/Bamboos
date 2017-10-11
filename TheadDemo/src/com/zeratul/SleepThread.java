package com.zeratul;

public class SleepThread  implements Runnable{
	
	

	@Override
	public void run() {
		
		try {
			System.out.println("thread start");
			Thread.sleep(2000);
			System.out.println("thread sleep end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

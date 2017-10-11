package com.zeratul.lock;

public class SyncThread implements Runnable {

	private static int count=0;
	private String name;
	
	
	
	public SyncThread(String name) {
		this.name = name;
	}



	@Override
	public void run() {
		
		synchronized(name){
			for(int i=0;i<5;i++){
				try {
					Thread.sleep(200);
					System.out.println(Thread.currentThread().getName()+" count :"+(count++)+"  ---"+name);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}

	}

}

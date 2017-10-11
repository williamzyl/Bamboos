package com.zeratul.lock;

public class SyncThreadOther implements Runnable {
	
	private static int count=0;
	private boolean flag=true;
	
	
	
	public SyncThreadOther(boolean flag) {
		this.flag = flag;
	}

	private void countAdd(){
		synchronized(this){
			for(int i=0;i<5;i++){
				try {
					System.out.println(Thread.currentThread().getName()+"---- count increment "+(count++));
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private void printCount(){
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + "---- count : " +count);
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("thread_1")){
			countAdd();
		}else{
//			countAdd();
			printCount();
		}
	}

}

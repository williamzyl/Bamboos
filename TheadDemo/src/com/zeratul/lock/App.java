package com.zeratul.lock;

public class App {

	public static void main(String[] args) {
//		SyncThread syncThread=new SyncThread("t1");
//		SyncThread syncThread2=new SyncThread("t2");
		
		SyncThreadOther syncThread=new SyncThreadOther(true);
		SyncThreadOther syncThread2=new SyncThreadOther(false);
		Thread t1=new Thread(syncThread, "thread_1");
		Thread t2=new Thread(syncThread, "thread_2");
		t1.start();
		t2.start();

	}

}

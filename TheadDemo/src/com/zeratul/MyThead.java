package com.zeratul;

public class MyThead implements Runnable{

	
	@Override
	public void run() {
		for(int i=0;i<20;i++){
			System.out.println("Mythead :"+i);
		}
	}

}

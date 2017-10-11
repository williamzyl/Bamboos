package com.zeratul;

public class PlayService {
	
	
	
	public void Play(String video){
		System.out.println("play the url:"+video);
	}
	
	public boolean Pause(String param){
		System.out.println("Pause video "+param);
		return true;
	}
	
	
	public void seek(int position) throws Exception{
		if(position>100){
			throw new Exception("Maximum progress length exceeded");
		}
		System.out.println("seek to position:"+position);
	}
	
	
	public void feedback(String msg){
		System.out.println("feedback :"+msg);
	}
}

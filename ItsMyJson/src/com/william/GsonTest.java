package com.william;

import com.google.gson.Gson;
import com.william.bean.Video;

public class GsonTest {

	
	public static void main(String[] args) {
		Gson gson=new Gson();
		String jsonStr="{\"videoTitle\": \"True Blood Season 4: An Important Message from Anna Paquin (HBO)\",\"image\": \"https://i.ytimg.com/vi/4d6Zhf_IHTs/hqdefault.jpg\",\"timeLength\": \"0:44\",\"url\": \"http://pth.lulu-tv.com//video/stream/4d6Zhf_IHTs/43\"}";
		
		Video video=gson.fromJson(jsonStr, Video.class);
		System.out.println(video);
	}

}

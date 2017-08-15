package com.william.bean;

public class Video {
	
	private String videoTitle;
	private String image;
	private String timeLength;
	private String url;
	
	public String getVideoTitle() {
		return videoTitle;
	}
	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTimeLength() {
		return timeLength;
	}
	public void setTimeLength(String timeLength) {
		this.timeLength = timeLength;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	@Override
	public String toString() {
		return "Video [videoTitle=" + videoTitle + ", image=" + image + ", timeLength=" + timeLength + ", url=" + url
				+ "]";
	}
	

}

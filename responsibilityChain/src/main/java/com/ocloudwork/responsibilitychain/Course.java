package com.ocloudwork.responsibilitychain;

public class Course {
	private String name;
	private String acticle;
	private String video;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActicle() {
		return acticle;
	}
	public void setActicle(String acticle) {
		this.acticle = acticle;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", acticle=" + acticle + ", video=" + video + "]";
	}
	
	
}

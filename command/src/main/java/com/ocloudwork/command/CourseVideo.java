package com.ocloudwork.command;

public class CourseVideo {

	private String name;

	public CourseVideo(String name) {
		this.name = name;
	}

	public void open() {
		System.out.println(name + "课程免费开放");
	}

	public void close() {
		System.out.println(name + "课程免费期已到，付费收看");
	}
}

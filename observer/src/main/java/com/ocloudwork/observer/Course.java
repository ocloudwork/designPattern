package com.ocloudwork.observer;

import java.util.Observable;

public class Course extends Observable{
	private String courseName;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}
	
	
	public void productQuestion(Course course,Question question) {
		System.out.println(question.getUserName()+"提问："+course.getCourseName()+"课程相关问题");
		setChanged();
		notifyObservers(question);
	}

}

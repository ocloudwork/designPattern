package com.ocloudwork.observer;

public class Main {

	public static void main(String[] args) {
		Course course=new Course("java 设计模式");
		Teacher teacher=new Teacher("jingfeng");
		Teacher helpteacher=new Teacher("助教");
		
		Question question =new Question();
		question.setUserName("minghui");
		question.setQuestionContent("什么是观察者模式？");
		
		//注册观察者
		course.addObserver(teacher);
		course.addObserver(helpteacher);
		course.productQuestion(course, question);
	}

}

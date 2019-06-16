package com.ocloudwork.observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer{

	private String teacherName;

	public Teacher(String teacherName) {
		this.teacherName = teacherName;
	}
	
	//高并发时（观察者非常多），该方法中的处理最好通过消息队列、生产者/消费者等异步方式完成
	@Override
	public void update(Observable o, Object arg) {
		Course course=(Course)o;
		Question question=(Question)arg;
		System.out.println(teacherName+"老师的"+course.getCourseName()+"课程接收到一个问题：（提问人："+question.getUserName()+"） "+question.getQuestionContent());
	}
	
}

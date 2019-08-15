package com.ocloudwork.command;

public class Main {

	public static void main(String[] args) {
		CourseVideo courseVideo=new CourseVideo("设计模式");
		
		Command c1=new OpenCourseVideoCommand(courseVideo);
		Command c2=new CloseCourseVideoCommand(courseVideo);
		
		Staff staff=new Staff();
		staff.addCommand(c1);
		staff.addCommand(c2);
		
		staff.executeCommands();
	}

}

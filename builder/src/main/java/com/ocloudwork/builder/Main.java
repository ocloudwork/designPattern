package com.ocloudwork.builder;

public class Main {

	public static void main(String[] args) {
		CourseBuilder courseBuilder = new CourseActualBuilder();
		Coach coach = new Coach();
		coach.setCourseBuilder(courseBuilder);

		Course course = coach.makeCourse("java设计模式", "ppt", "视频", "笔记", "问答");
		System.out.println(course);
	}

}

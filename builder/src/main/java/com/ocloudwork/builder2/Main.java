package com.ocloudwork.builder2;

public class Main {

	public static void main(String[] args) {

		Course course = new Course.CourseBuilder().builderCourseName("java设计模式").builderCoursePPT("ppt")
				.builderCourseVideo("视频").build();
		System.out.println(course);
	}

}

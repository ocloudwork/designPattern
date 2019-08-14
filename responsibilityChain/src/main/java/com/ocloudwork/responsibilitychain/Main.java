package com.ocloudwork.responsibilitychain;

public class Main {

	public static void main(String[] args) {
		Approver approver1 = new ActicleApprover();
		Approver approver2 = new VideoHandler();
		Course course=new Course();
		course.setName("设计模式");
		course.setActicle("23种设计模式文章");
		//course.setVideo("20G视频资料");
		
		//审核课程上线
		approver1.setNextApprover(approver2);
		approver1.deploy(course);
	}

}

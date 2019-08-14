package com.ocloudwork.responsibilitychain;

public class ActicleApprover extends Approver {

	@Override
	public void deploy(Course course) {
		if (null != course.getActicle()) {
			System.out.println(course.getName() + "课程中包含了文章，审批通过");
			// 执行下一个审批
			if (approver != null) {
				approver.deploy(course);
			}
		}else {
			System.out.println(course.getName() + "课程中不包含了文章，审批不通过,结束审批");
			return;
		}
	}

}

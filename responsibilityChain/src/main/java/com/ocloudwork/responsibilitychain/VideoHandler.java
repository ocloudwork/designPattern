package com.ocloudwork.responsibilitychain;

//也可以用Handler、Chain命名
public class VideoHandler extends Approver {

	@Override
	public void deploy(Course course) {
		if (null != course.getVideo()) {
			System.out.println(course.getName() + "课程中包含了视频，审批通过");
			// 执行下一个审批
			if (approver != null) {
				approver.deploy(course);
			}
		}else {
			System.out.println(course.getName() + "课程中不包含了视频，审批不通过,结束审批");
			return;
		}
	}

}

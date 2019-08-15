package com.ocloudwork.command;

public class CloseCourseVideoCommand implements Command{

	private CourseVideo courseVideo;
	
	public CloseCourseVideoCommand(CourseVideo courseVideo) {
		this.courseVideo=courseVideo;
	}
	
	@Override
	public void execute() {
		courseVideo.close();
	}

}

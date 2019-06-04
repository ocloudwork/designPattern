package com.ocloudwork.factorymethod;

public class JavaVideoFactory extends VideoFactory{

	@Override
	public Video getVideo() {
		return new JavaVideo();
	}

}

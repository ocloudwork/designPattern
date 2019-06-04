package com.ocloudwork.factorymethod;

public class PythonVideoFactory extends VideoFactory{

	@Override
	public Video getVideo() {
		return new PythonVideo();
	}

}

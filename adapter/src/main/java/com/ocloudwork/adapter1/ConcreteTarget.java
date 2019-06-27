package com.ocloudwork.adapter1;

public class ConcreteTarget implements Target{

	@Override
	public void request() {
		System.out.println("ConcreteTarget目标方法");
	}

}

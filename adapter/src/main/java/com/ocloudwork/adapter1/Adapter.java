package com.ocloudwork.adapter1;

public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		//增加业务逻辑代码
		super.adapteeRequest();
		//增加业务逻辑代码
	}

}

package com.ocloudwork.adapter2;

public class Adapter implements Target{
	
	private Adaptee adaptee=new Adaptee();
	@Override
	public void request() {
		//增加业务逻辑代码
		adaptee.adapteeRequest();
		//增加业务逻辑代码
	}

}

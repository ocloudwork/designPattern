package com.ocloudwork.prototype.abstr;

public abstract class TestAbstract implements Cloneable {
	
	//这个方法的权限是protected
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

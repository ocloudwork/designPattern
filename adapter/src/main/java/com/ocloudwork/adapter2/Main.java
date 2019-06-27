package com.ocloudwork.adapter2;

/**
 * 对象适配器模式，使用了接口
 * @author minghui
 *
 */
public class Main {

	public static void main(String[] args) {
		Target target=new ConcreteTarget();
		target.request();
		
		Target adapterTarget=new Adapter();
		adapterTarget.request();
	}

}

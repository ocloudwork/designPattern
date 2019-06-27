package com.ocloudwork.adapter1;

/**
 * 类适配器模式，使用了继承
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

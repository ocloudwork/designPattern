package com.ocloudwork.factorymethod;

/**
 * 工厂方法(Factory Method)模式的意义是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类当中。
 * 核心工厂类不再负责产品的创建，这样核心类成为一个抽象工厂角色，仅负责具体工厂子类必须实现的接口，
 * 这样进一步抽象化的好处是使得工厂方法模式可以使系统在不修改具体工厂角色的情况下引进新的产品。
 * @author minghui
 *
 */
public class Main {

	public static void main(String[] args) {
		VideoFactory factory1=new JavaVideoFactory();
		Video v1=factory1.getVideo();
		v1.produce();
		
		VideoFactory factory2=new PythonVideoFactory();
		Video v2=factory2.getVideo();
		v2.produce();
	}

}

package com.ocloudwork.prototype.singleton;

/**
 * 饿汉式（静态代码块）[可用] 
 * 类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例
 * 优缺点和Singleton1一样
 * 
 * @author minghui
 *
 */
public class Singleton2 implements Cloneable{

	private final static Singleton2 instance;

	static {
		instance = new Singleton2();
	}

	private Singleton2() {
		if (instance!=null) {
			throw new RuntimeException("单例构造器禁止反射调用！");
		}
	}

	public static Singleton2 getInstance() {
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		return instance;
	}
}

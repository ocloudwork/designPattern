package com.ocloudwork.prototype.singleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	/**
	 * 实现了clone，会导致单例破坏
	 * @param args
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton2 s1 = Singleton2.getInstance();
		Method method = s1.getClass().getDeclaredMethod("clone");
		method.setAccessible(true);
		Singleton2 s2 = (Singleton2) method.invoke(s1);
		System.out.println(s1);
		System.out.println(s2);
		
		//为了不破坏单例模式实现：1.可以不实现clone；2.在克隆方法中直接返回单例实例
	}
}

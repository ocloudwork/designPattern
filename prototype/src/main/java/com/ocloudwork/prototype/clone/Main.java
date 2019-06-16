package com.ocloudwork.prototype.clone;

import java.util.Date;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date birthday = new Date(0L);
		Pig p1 = new Pig("小猪", birthday);
		Pig p2 = (Pig) p1.clone();
		System.out.println(p1);
		System.out.println(p2);
		
		//浅克隆，修改p1的生日,2个小猪的生日都被修改了。
		//深克隆，需要对引用对象属性做克隆
		p1.getBirthday().setTime(88888L);
		System.out.println(p1);
		System.out.println(p2);
		
		
	}

}

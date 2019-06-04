package com.ocloudwork.abstractfactory;

/**
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。
 * 该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * @author minghui
 *
 */
public class Main {

	public static void main(String[] args) {
		CourseFactory f1=new JavaCourseFactory();
		Video v1=f1.getVideo();
		Article a1=f1.getArticle();
		v1.produce();
		a1.produce();
		
		CourseFactory f2=new PythonCourseFactory();
		Video v2=f2.getVideo();
		Article a2=f2.getArticle();
		v2.produce();
		a2.produce();
	}

}

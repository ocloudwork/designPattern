package factory1;

/**
 * 简单工厂模式是属于创建型模式，又叫做静态工厂方法(Static Factory Method)模式，但不属于23种GOF设计模式之一。
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 * 简单工厂模式是工厂模式家族中最简单实用的模式，
 * 可以理解为是不同工厂模式的一个特殊实现。
 * @author minghui
 *
 */
public class Main {

	public static void main(String[] args) {
		//原始写法
//		Video video=new JavaVideo();
		Video video=new PythonVideo();
		video.produce();
		
		//简单工厂
		VideoFactory vf = new VideoFactory();
		Video video1 = vf.getVideo("java");
		video1.produce();
		
		//使用反射的简单工厂
		Video video2 =VideoFactory.getVideo(PythonVideo.class);
		video2.produce();
	}

}

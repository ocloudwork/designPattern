package singleton;

/**
 * 静态内部类[推荐用]
 * 静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化
 * 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * 
 * 优点：避免了线程不安全，延迟加载，效率高。
 * 缺点：在遇到序列化对象时，默认的方式运行得到的结果就是多例的
 * 
 * @author minghui
 *
 */
public class Singleton7 {

	private Singleton7() {
	}

	private static class SingletonInstance {
		private static final Singleton7 INSTANCE = new Singleton7();
	}

	public static Singleton7 getInstance() {
		return SingletonInstance.INSTANCE;
	}
}

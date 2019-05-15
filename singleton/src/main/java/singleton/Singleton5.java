package singleton;

/**
 * 懒汉式(线程安全，同步代码块)[不可用] 假如一个线程进入了if (singleton ==
 * null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 * 
 * @author minghui
 *
 */
public class Singleton5 {

	private static Singleton5 singleton;

	private Singleton5() {
	}

	public static Singleton5 getInstance() {
		if (singleton == null) {
			synchronized (Singleton5.class) {
				singleton = new Singleton5();
			}
		}
		return singleton;
	}
}

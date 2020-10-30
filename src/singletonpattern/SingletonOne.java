package singletonpattern;
/**
 * 饿汉式 --开始就创建好，随时用就取
 *私有化该类的构造函数
 *通过new在本类中创建一个本类对象
 *定义一个公有的方法，讲在该类中所创建的对象返回
 */
public class SingletonOne {
	private static SingletonOne instance = new SingletonOne();
	private SingletonOne() {};
	public static SingletonOne getInstance() {
		return instance;
	}
}

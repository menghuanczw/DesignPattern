package singletonpattern;
/**
 * 饿汉式变换写法 
 */
public class SingletonTwo {
	private static SingletonTwo instance = null;
	
	static {
		instance = new SingletonTwo();
	}
	private SingletonTwo() {}
	
	public static SingletonTwo getInstance() {
		return instance;
	}
}

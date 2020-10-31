package singletonpattern;
/**
 * 饿汉式变换写法 
 */
public class SingletonTwo {
	private static SingletonTwo instance = null;
	//在第一次使用时执行
	static {
		instance = new SingletonTwo();
	}
	private SingletonTwo() {}
	
	public static SingletonTwo getInstance() {
		return instance;
	}
}

package singletonpattern;
/**
 * 懒汉式 --使用时先去判断创建没，没创建就创建，并保存起来，供的地方使用；创建了就直获取接用。
 *
 */
public class SingletonThree {
	private static SingletonThree instance= null;
	
	private SingletonThree() {}
	/**
	 * 加 synchronized 修饰后 线程安全
	 * @return
	public static SingletonThree getInstance() {
		if(instance == null) {
			instance = new SingletonThree();
		}
		return instance;
	}*/
	
	/*
	 * 双重校验锁
	 */
	public static SingletonThree getInstance(){
		 if (instance == null) {  //第一次检验
	          synchronized (SingletonThree.class) {  
	              if (instance == null) {  //再次检验
	            	  instance = new SingletonThree();
	              }  
	          }  
	      }  
	      return instance;  
	}


}

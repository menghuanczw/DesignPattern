package threadpattern.synchroniezd;

import java.util.concurrent.TimeUnit;
/**
 * 锁的可重入 ，同一线程可进入相同对象锁的方法
 * @author czw
 *
 */
public class Again {

	public synchronized void m1() {
		System.out.println("m1方法开始执行");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		m2();
		System.out.print("m1方法执行结束");
	}
	
	public synchronized void m2() {
		System.out.println("m2方法开始执行");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("m2方法执行结束");
	}
	
	public static void main(String[] args) {
		Again a = new Again();
		a.m1();
	}

}

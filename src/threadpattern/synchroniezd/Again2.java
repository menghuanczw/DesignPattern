package threadpattern.synchroniezd;

import java.util.concurrent.TimeUnit;
/**
 * 同一实例的同步方法，某一时刻只能被一个线程访问
 * @author czw 33 44 修改
 *
 */
public class Again2 {

	public synchronized void m1() {
		System.out.println("开始执行m1方法");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("结束执行吗m1方法");
	}
	public synchronized void m2() {
		System.out.println("开始执行m2方法");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("结束执行吗m2方法");
	}
	public static void main(String[] args) {
		Again2 a2 = new Again2();
		new Thread(()->a2.m1()).start();
		new Thread(()->a2.m2()).start();
//		输出：
//		开始执行m1方法
//		结束执行吗m1方法
//		开始执行m2方法
//		结束执行吗m2方法

	}

}

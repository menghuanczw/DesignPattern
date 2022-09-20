package threadpattern.join;

import java.util.concurrent.TimeUnit;

public class ThreadJoinTest {

	public void first(Thread secondThread) {
		System.out.println("first 方法开始执行！");
		secondThread.start();
		try {
			secondThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("first 方法执行结束！");
	}
	
	public void second(){
		System.out.println("second 方法开始执行！");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("second 方法结束执行！");
	}
	
	public static void main(String[] args) {
		ThreadJoinTest tjt = new ThreadJoinTest();
		Thread secondThread = new Thread(new Runnable() {
			@Override
			public void run() {
				tjt.second();
			}
		});
		
		new Thread(() ->  {tjt.first(secondThread);
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}}) .start();
		
	}

	
}

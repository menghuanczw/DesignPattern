package threadpattern.synchroniezd;

import java.util.concurrent.TimeUnit;

public class DisableTest {
	//加上volatile 可以让线程停
	private /**volatile*/ boolean b = true;
	
	private void m() {
		System.out.println("开始运行");
		while(b) {}
		System.out.println("结束运行");
	}
	public static void main(String[] args) {
		DisableTest d = new DisableTest();
		new Thread(new Runnable() {
			@Override
			public void run() {
				d.m();
			}
		}).start();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		d.b = false;
	}

	

}

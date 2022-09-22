package threadpattern.synchroniezd;

import java.util.concurrent.TimeUnit;
/**
 * 异常自动释放锁,不影响其他线程
 * @author czw
 *
 */
public class ExceptionTest {

	private int i = 0;
	public synchronized void m1() {
		while(true) {
			i++;
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+",i="+i);
				if(i == 5) {
					int b = i/0; //此处异常，可捕获然后继续执行
				}
		}
	}
	
	public static void main(String[] args) {
		ExceptionTest e = new ExceptionTest();
		new Thread(()->{
			e.m1();
		},"t1").start();

		new Thread(()->{
			e.m1();
		},"t2").start();
	}

}

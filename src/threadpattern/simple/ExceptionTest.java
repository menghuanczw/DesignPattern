package threadpattern.simple;

import java.util.concurrent.TimeUnit;
/**
 * 异常自动释放锁
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
				System.out.println(Thread.currentThread().getName());
				if(i == 5) {
					int b = i/0;
				}
			} catch (InterruptedException e) {
				i = 0;
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		ExceptionTest e = new ExceptionTest();
		new Thread(()->{
			e.m1();
		}).start();

		new Thread(()->{
			e.m1();
		}).start();
	}

}

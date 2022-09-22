package threadpattern.synchroniezd;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class IncrementTest {

	AtomicInteger a = new AtomicInteger(0);//原子性操作方法
	public void m() {
		a.incrementAndGet();
	}
	
	public static void main(String[] args) {
		IncrementTest it = new IncrementTest();
	List<Thread> threads = new ArrayList<Thread>();
	for(int i = 0;i <10;i++) {
		threads.add(new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0;i<10000;i++)
					it.m();
			}
		}));
	}
	for(Thread thread:threads) {
		try {
			thread.start();
			thread.join();//在start 之后join
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println(it.a.intValue());//输出10 000
	}
}

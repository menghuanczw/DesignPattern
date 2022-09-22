package threadpattern.synchroniezd;

public class SynchronizedTest {
	public synchronized void m1() {
		System.out.println("m1方法开始执行。。。");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("m1方法执行结束。。。");
	}
	
	public void m2() {
		System.out.println("m2方法开始执行。。。");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("m2方法执行结束。。。");
	}
	Object o = new Object();
	public void m3() {
		synchronized(o) {
			System.out.println("m3方法开始执行。。。");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("m3方法执行结束。。。");
		}
	}
	public static class RunnableTest implements Runnable{
		
		private SynchronizedTest synchronizedTest;
		private int i;
		
		public RunnableTest(int i,SynchronizedTest synchronizedTest ) {
			this.synchronizedTest = synchronizedTest;
			this.i = i;
		}

		@Override
		public void run() {
			if(i == 1) {
				synchronizedTest.m1();
			}else if(i == 2) {
				synchronizedTest.m2();
			}else if(i == 3) {
				synchronizedTest.m3();
			}
		}
		
	}
	public static void main(String[] args) {
		SynchronizedTest synchronizedTest = new SynchronizedTest();
		new Thread(new RunnableTest(1,synchronizedTest)).start();
		new Thread(new RunnableTest(2,synchronizedTest)).start();
		new Thread(new RunnableTest(3,synchronizedTest)).start();
	}
}


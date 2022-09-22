package threadpattern.synchroniezd;

import java.util.concurrent.TimeUnit;
/**
 * 数据赃度
 * 一个业务逻辑写没完成，另外一个业务逻辑去读。
 * @author czw 同一对象的读写方法也可要同步
 *
 */
public class WriteError {

	private double d;
	
	public synchronized void m1(double d) {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.d = d;
	}
	
	public double getD() {
		return this.d;
	}
	
	public static class ThreadTest extends Thread{
		private WriteError writeError;
		private double d;
		
		public ThreadTest(WriteError writeError,double d) {
			this.writeError = writeError;
			this.d = d;
		}
		public void run() {
			writeError.m1(d);
		}
	}
	
	public static void main(String[] args) {
		WriteError we = new WriteError();
		new ThreadTest(we,1).start();
		System.out.println(we.getD());
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(we.getD());
	}

}

package threadpattern.synchroniezd;

import java.util.concurrent.Exchanger;

public class ExchangerTest {

	public void a (Exchanger<String> ex) {
		try {
			ex.exchange("like");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void b (Exchanger<String> ex) {
		try {
			String s = ex.exchange("");
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ExchangerTest et = new ExchangerTest();
		Exchanger ex = new Exchanger();
		new Thread(() ->{et.a(ex);}).start();  

		new Thread(() ->{et.b(ex);}).start();  
	}

}

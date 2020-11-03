package templatepattern;
/**
 * 模板方法模式
 * 抽象类  @Worker 实现基本算法步骤和抽象方法
 * 其他类 继承 @Worker,可重写独和模板方法不一致的地方
 */
public class Test {

	public static void main(String[] args) {
		Worker it1 = new ITWorker("鸿洋");
		it1.workOneDay();
		Worker it2 = new ITWorker("老张");
		it2.workOneDay();
		Worker hr = new HRWorker("迪迪");
		hr.workOneDay();
		TestWorker test = new TestWorker("阿蒙");
		test.workOneDay();

	}

}

package templatepattern;

public class TestWorker extends Worker {

	public TestWorker(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + "写测试用例-提交bug-写测试用例");
	}

}

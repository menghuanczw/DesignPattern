package templatepattern.gouzi;

public class HRWorker extends Worker {

	public HRWorker(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + "看简历-打电话-接电话");
	}
	
	/**
	 * 重写此方法，开启打印时间
	 */
	@Override
	public boolean isNeedPrintDate() {
		return true;
	}

}

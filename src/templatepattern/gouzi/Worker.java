package templatepattern.gouzi;

import java.util.Date;

public abstract class Worker {
	protected String name;

	public Worker(String name) {
		this.name = name;
	}

	public final void workOneDay() {
		System.out.println("-----------------work start ---------------");
		enterCompany();
		computerOn();
		work();
		computerOff();
		exitCompany();
		System.out.println("-----------------work end ---------------");

	}
	/**
	 * 默认不打印时间，
	 * 关于钩子，超类中可提供默认实现或者空实现，子类可覆盖或者不覆盖，具体根据需求来定。
	 * @return
	 */
	public boolean isNeedPrintDate() {
		return false;
	}

	/**
	 * 工作
	 */
	public abstract void work();

	/**
	 * 关闭电脑
	 */
	private void computerOff() {
		System.out.println(name + "关闭电脑");
	}

	/**
	 * 打开电脑
	 */
	private void computerOn() {
		System.out.println(name + "打开电脑");
	}

	/**
	 * 进入公司
	 */
	public void enterCompany() {
		System.out.println(name + "进入公司");
	}

	/**
	 * 离开公司
	 */
	public void exitCompany() {
		if (isNeedPrintDate()) {
			System.out.print(new Date().toString() + "-->");
		}
		System.out.println(name + "离开公司");
	}

}

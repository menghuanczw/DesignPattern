package adapterpattern;

/**
 *  客户端
 *  需要  @V5Power 对象
 */
public class Mobile {
	public void inputPower(V5Power power) {
		int provideV5Power = power.provideV5Power();
		System.out.println("手机：我需要5V电压充电，现在是 ："+ provideV5Power +"V");
	}
}

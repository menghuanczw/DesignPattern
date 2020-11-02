package adapterpattern;
/**
 * 被适配的对象 220电压
 */
public class V220Power {
	
	public int provideV220Power() {
		System.out.println("V220Power：我提供220V交流电压");
		return 220;
	}
}

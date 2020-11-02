package adapterpattern;

public class PowerTest {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		//创建适配器对象，输入 V220Power对象，输出V5Power对象
		V5Power v5Power = new V5PowerAdapter(new V220Power());
		mobile.inputPower(v5Power);
	}

}

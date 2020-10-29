package factorypattern.abstractfactory;

public abstract class RouMo {
	//protected 修饰，在继承类中可见
	protected String name;
	
	public void prepare(RouMoFoodFactory rouMoFoodFactory) {
		Meat meat = rouMoFoodFactory.createMeate();
		Flour folur = rouMoFoodFactory.createFlour();
		System.out.println("和面-做陷-准备完成");
	}
	
	public void pack() {
		System.out.println("肉夹馍-包装袋-包装");
	}
	public void fire() {
		System.out.println("肉夹馍-制作设备-烘烤");
	}
}

package factorypattern.abstractfactory;

public abstract class RouMoStore {
	//相当于工厂,可以扩展多个，自己有具体实现
	public abstract RouMo createRouMo(String type);
	
	
	/**
	 * 更具类型卖不同的馍
	 * @param type
	 * @return
	 */
	public RouMo sellRouMo(String type) {
		RouMo rouMo = createRouMo(type);
		//食材提供工厂  直接获取获取
		rouMo.prepare(new XianRouMoFoodFactory());
		rouMo.fire();
		rouMo.pack();
		return rouMo;
	}
}

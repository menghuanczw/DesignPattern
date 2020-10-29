package factorypattern.abstractfactory;

public abstract class RouMoStore {
	/**
	 * 创建肉夹馍的抽象方法，子类去实现
	 */
	public abstract RouMo createRouMo(String type);
	
	
	/**
	 * 卖肉夹馍方法
	 * @param type 类型参数
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

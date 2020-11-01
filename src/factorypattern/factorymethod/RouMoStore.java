package factorypattern.factorymethod;

import factorypattern.factorymethod.mo.RouMo;

/**
 * 抽象肉夹馍摊，有具体的摊来生产其他种类的肉夹馍
 */
public abstract class RouMoStore {
	//将工厂类对象（有创建肉夹馍的方法）换成了抽象方法，让子类有具体实现
	public abstract RouMo createRouMo(String type);
	
	/**
	 * 卖肉夹馍馍
	 * @param type
	 * @return
	 */
	public RouMo sellRouMo(String type) {
		RouMo rouMo = createRouMo(type);
		rouMo.prepare();
		rouMo.fire();
		rouMo.pack();
		return rouMo;
	}
}

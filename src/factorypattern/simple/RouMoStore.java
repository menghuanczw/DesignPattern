package factorypattern.simple;
/**
 * 肉夹馍摊
 */
public class RouMoStore {
	/**
	 * 1，生肉夹馍工厂，此为一个指定类，只有一种固定创建方法。
	 * 2，可以是一个借口对象，具体实例创建不同种类肉夹馍
	 * 3，也可以是抽象方法，此类是抽象类，让具继承类来具体实现
	 */
	private SimpleRouMoFactory simpleRouMoFactory;
	
	public RouMoStore(SimpleRouMoFactory simpleRouMoFactory) {
		this.simpleRouMoFactory = simpleRouMoFactory;
	}
	
	public RouMo sellRouMo(String type) {
		//新增和修改只需要修改生肉馍对象工厂类，和肉夹馍摊  RouMoStore 馍解耦
		RouMo rouMo = simpleRouMoFactory.createRouMo(type);
		
		rouMo.prepare();
		rouMo.fire();
		rouMo.pack();
		return rouMo;
	}
	
}

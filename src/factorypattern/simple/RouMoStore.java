package factorypattern.simple;
/**
 * 肉夹馍摊
 */
public class RouMoStore {
	/**
	 * 生肉夹馍工厂
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

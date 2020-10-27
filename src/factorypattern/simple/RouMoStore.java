package factorypattern.simple;

public class RouMoStore {
	
	private SimpleRouMoFactory factory;
	
	public RouMoStore(SimpleRouMoFactory factory) {
		this.factory = factory;
	}
	
	public RouMo sellRouMo(String type) {
		//新增和修改只需要修改工厂类，和卖馍解耦
		RouMo rouMo = factory.createRouMo(type);
		
		rouMo.prepare();
		rouMo.fire();
		rouMo.pack();
		return rouMo;
	}
	
}

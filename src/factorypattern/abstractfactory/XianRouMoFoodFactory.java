package factorypattern.abstractfactory;
/**
 * 西安肉夹馍 食材创建实现类
 * 可以有不同的食材实现类
 */
public class XianRouMoFoodFactory implements RouMoFoodFactory{
	
	private String meat;
	private String flour;
	
	@Override
	public Meat createMeate() {
		return new Meat();
	}

	@Override
	public Flour createFlour() {
		return new Flour();
	}

}

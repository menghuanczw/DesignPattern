package factorypattern.abstractfactory;
/**
 * 肉夹馍食材创建接口
 */
public interface RouMoFoodFactory {
	public Meat createMeate();
	
	public Flour createFlour();
}

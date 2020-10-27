package factorypattern.abstractfactory;

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

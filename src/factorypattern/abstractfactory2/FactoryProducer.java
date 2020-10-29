package factorypattern.abstractfactory2;

/**
 * 工厂生成器/生产器类
 * 生成图形或颜色工厂，
 * 再由颜色或图形工厂 生成具体图形和颜色
 */
public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();

		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;

	}
}

package factorypattern.abstractfactory2;
/**
 * @Shape 接口具体实现
 */
public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("inside rectangle:draw() method.");
	}

}

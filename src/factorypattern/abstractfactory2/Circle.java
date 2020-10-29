package factorypattern.abstractfactory2;

/**
 * @Shape 接口具体实现
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		 System.out.println("Inside Circle::draw() method.");
	}

}

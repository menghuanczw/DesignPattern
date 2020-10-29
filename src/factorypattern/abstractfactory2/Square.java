package factorypattern.abstractfactory2;
/**
 * @Shape 接口具体实现类
 */
public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}

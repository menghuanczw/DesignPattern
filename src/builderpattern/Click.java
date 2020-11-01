package builderpattern;
/**
 * Builder模式可以将一个类的构建 和 表示进行分离。
 * 使得同样的构建过程可以创建不同的表示。
 */
public class Click {

	public static void main(String[] args) {
		//创建一个实现构造接口的指定对象，里面有对应构造方法
		Builder builder = new OfoBuilder();
		//创建对应建造对象，选择 指定对象的方法来 建造产品
		Director director = new Director(builder);
		//建造过程
		Bike bike = director.construct();
	}

}

package factorypattern.abstractfactory;
/**
 * 西安肉夹馍摊，具体肉馍摊的实现，类似工厂
 * 继承 @RouMoStore ,实现抽象方法，*可以有多个实现
 * 肉夹馍食材接口 @RouMoFoodFactory，食材工厂接口
 * 肉夹馍抽象类 @RouMo ,
 * 肉夹馍摊抽象类 @RouMoStore，肉夹馍工厂抽象类
 */
public class XiAnRouMoStore extends RouMoStore{
	private static final String COW = "cow";
	private static final String PIG = "pig";
	private static final String  SHEEP = "sheep";
	
	@Override
	public RouMo createRouMo(String type) {
		RouMo rouMo = null;
		if(COW.equals(type)) {
			rouMo = new CowRouMo();
		}else if(PIG.equals(type)){
			rouMo = new PigRouMo();
		}else if(SHEEP.equals(type)) {
			rouMo = new SheepRouMo();
		}
		return rouMo;
	}

}

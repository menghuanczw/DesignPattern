package factorypattern.factorymethod;

import factorypattern.factorymethod.mo.CowRouMo;
import factorypattern.factorymethod.mo.PigRouMo;
import factorypattern.factorymethod.mo.RouMo;
import factorypattern.factorymethod.mo.SheepRouMo;

/**
 * 具体一个肉夹馍摊子类
 * 可以有多个摊的实现类，来卖不同类别的馍
 * 继承抽象类 @RouMoStore ， 在子类中  实现抽象方法 ，
 * 从而把具体类型的创建放在子类中	--工厂模式
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

package factorypattern.simple;

import factorypattern.simple.CowRouMo;
import factorypattern.simple.PigRouMo;
import factorypattern.simple.SheepRouMo;
/**
 * 生肉夹馍工厂类 ，新增和删除只在这里修改即可
 * 抽取了创建肉夹馍类型，后续操作公用
 */
public class SimpleRouMoFactory {
	private static final String COW = "cow";
	private static final String PIG = "pig";
	private static final String  SHEEP = "sheep";
	
	/**
	 * 创建生肉夹馍对象
	 */
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

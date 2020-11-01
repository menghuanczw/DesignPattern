package factorypattern.simple;

import factorypattern.simple.mo.CowRouMo;
import factorypattern.simple.mo.PigRouMo;
import factorypattern.simple.mo.RouMo;
import factorypattern.simple.mo.SheepRouMo;
/**
 * 生的肉夹馍机器，（类似工厂类） 
 * 新增和删除只在这里修改即可
 * 抽取了创建不同肉夹馍类型，让其他相同操作可以共用
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

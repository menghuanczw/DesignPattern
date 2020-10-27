package factorypattern.simple;

import factorypattern.simple.CowRouMo;
import factorypattern.simple.PigRouMo;
import factorypattern.simple.SheepRouMo;

public class SimpleRouMoFactory {
	private static final String COW = "cow";
	private static final String PIG = "pig";
	private static final String  SHEEP = "sheep";
	
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

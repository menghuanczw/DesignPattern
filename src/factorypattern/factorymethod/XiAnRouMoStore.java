package factorypattern.factorymethod;
/**
 * 相当于工厂
 * @author czw
 *
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

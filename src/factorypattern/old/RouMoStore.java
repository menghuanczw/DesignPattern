package factorypattern.old;
/**
 * 卖肉夹馍摊，类似工厂
 */
public class RouMoStore {
	private static final String COW = "cow";
	private static final String PIG = "pig";
	private static final String  SHEEP = "sheep";
	

	/**
	 * 	 卖不同种类肉夹馍
	 * 	耦合高，新增和删除种类 要修改此方法。
	 * @param type
	 * @return
	 */
	public RouMo sellRouMo(String type) {
		RouMo rouMo = null;
		if(COW.equals(type)) {
			rouMo = new CowRouMo();
		}else if(PIG.equals(type)){
			rouMo = new PigRouMo();
		}else if(SHEEP.equals(type)) {
			rouMo = new SheepRouMo();
		}else {
			return rouMo;
		}
		rouMo.prepare();
		rouMo.fire();
		rouMo.pack();
		return rouMo;
	}
}

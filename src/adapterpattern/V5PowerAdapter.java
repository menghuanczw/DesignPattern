package adapterpattern;
/**
 * 适配器  @Mobile 和  @V220Power
 * 
 */
public class V5PowerAdapter implements V5Power{

	private V220Power v220Power;
	
	public V5PowerAdapter(V220Power v220Power) {
		this.v220Power = v220Power;
	}
	
	@Override
	public int provideV5Power() {
		int inPower = v220Power.provideV220Power();
		int outPower = inPower / (inPower / 5);
		System.out.println("适配器：将 " + inPower +"V ->" +  outPower + "V");
		return outPower;
	}

}

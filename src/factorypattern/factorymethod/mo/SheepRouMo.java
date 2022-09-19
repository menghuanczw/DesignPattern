package factorypattern.factorymethod.mo;
/**
 * 羊肉馍对象
 */
public class SheepRouMo extends RouMo{
	
	public SheepRouMo() {
		this.name = "羊肉肉夹馍";
	}

	@Override
	public String toString() {
		return "SheepRouMo{" +
				"name='" + name + '\'' +
				'}';
	}
}

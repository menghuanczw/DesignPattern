package factorypattern.factorymethod.mo;
/**
 * 猪肉馍对象
 */
public class PigRouMo extends RouMo{
	
	public PigRouMo() {
		this.name = "猪肉肉夹馍";
	}

	@Override
	public String toString() {
		return "PigRouMo{" +
				"name='" + name + '\'' +
				'}';
	}
}

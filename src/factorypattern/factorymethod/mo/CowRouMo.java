package factorypattern.factorymethod.mo;
/**
 * 牛肉馍对象
 */
public class CowRouMo extends RouMo{
	public CowRouMo() {
		this.name = "牛肉肉夹馍";
	}

	@Override
	public String toString() {
		return "CowRouMo{" +
				"name='" + name + '\'' +
				'}';
	}
}

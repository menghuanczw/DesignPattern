package builderpattern;
/**
 * 指挥者
 * 指挥构建单车的流程和步骤
 */
public class Director {
	private Builder builder = null;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public Bike construct() {
		builder.buildFrame();
		builder.buildSeat();
		builder.buildTire();
		return builder.createBike();
	}
}

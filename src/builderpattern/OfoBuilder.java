package builderpattern;

import builderpattern.impl.OfoFrame;
import builderpattern.impl.OfoSeat;
import builderpattern.impl.OfoTire;
/**
 * ofo 建造者
 * 其方法时建ofo单车的具体步骤
 *
 */
public class OfoBuilder extends Builder{
	private Bike bike = new Bike(); 
	
	@Override
	void buildFrame() {
		bike.setFrame(new OfoFrame());
	}

	@Override
	void buildSeat() {
		bike.setSeat(new OfoSeat());
	}

	@Override
	void buildTire() {
		bike.setTire(new OfoTire());
	}

	@Override
	Bike createBike() {
		return bike;
	}

}

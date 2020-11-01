package builderpattern;

import builderpattern.impl.MobaiFrame;
import builderpattern.impl.MobaiSeat;
import builderpattern.impl.MobaiTire;
/**
 * 膜拜建造者
 * 其方法时建造膜拜单车的具体步骤
 */
public class MobikeBuilder extends Builder{
	private Bike bike = new Bike(); 
	
	@Override
	void buildFrame() {
		bike.setFrame(new MobaiFrame());
	}

	@Override
	void buildSeat() {
		bike.setSeat(new MobaiSeat());
	}

	@Override
	void buildTire() {
		bike.setTire(new MobaiTire());
	}

	@Override
	Bike createBike() {
		return bike;
	}

}

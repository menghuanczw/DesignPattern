package builderpattern;
/**
 * 建造单车抽象接口
 * 其抽象方法是建造单车的具体步骤
 *
 */
public abstract class Builder {
	abstract void buildFrame();
    abstract void buildSeat(); 
    abstract void buildTire(); 
    abstract Bike createBike();
}

package decoratorpattern;

/**
 * 被修饰的对象
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}

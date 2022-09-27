package decoratorpattern;

public class CoffeBarTest {
    public static void main(String[] args) {
        Drink drink = new CatCoffee();
        System.out.println("drink price:" + drink.cost());
        System.out.println("drink desc:" + drink.getDescription());
        System.out.println("****************");
        drink = new Milk(drink);
        System.out.println("order2 price:" + drink.cost());
        System.out.println("order2 desc:" + drink.getDescription());
    }
}

package decoratorpattern;

public class CatCoffee extends Coffee{
    public CatCoffee(){
        super.setDescription("CatCoffee");
        super.setPrice(3.0f);
    }
}

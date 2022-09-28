package proxypattern;

public class BuyHouseProxy implements BuyHouse{
   private BuyHouse buyHouse;
   public BuyHouseProxy(final BuyHouse buyHouse){
       this.buyHouse = buyHouse;
   }

    @Override
    public void buyhouse() {
        System.out.println("先攒钱。。。");
        buyHouse.buyhouse();
        System.out.println("装修入住。。。");
    }
}

public class Runner {

  public static void main(String[] args) {

    ShoppingBasket basket = new ShoppingBasket(new HalfPrice());
    System.out.println("After half-price discount, total is " + basket.totalAfterDiscount() + ".");

    basket = new ShoppingBasket(new TenPercentOff());
    System.out.println("After discount of 10 per cent, total is " + basket.totalAfterDiscount() + ".");

  }
}

public class HalfPrice implements Discountable {

  public double applyDiscount(double totalBeforeDiscount) {
    return totalBeforeDiscount/2;
  }

}
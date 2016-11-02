public class TenPercentOff implements Discountable {

  public double applyDiscount(double totalBeforeDiscount) {
    return (totalBeforeDiscount/10)*9;
  }

}
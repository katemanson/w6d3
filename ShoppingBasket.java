import java.util.*;

public class ShoppingBasket {

  private double totalBeforeDiscount;
  private Discountable discountType;

  public ShoppingBasket(Discountable discountType) {
    this.totalBeforeDiscount = 100.00;
    this.discountType = discountType;
  }

  public double totalAfterDiscount() {
    double newTotal = discountType.applyDiscount(this.totalBeforeDiscount);
    return newTotal;
  }

}
package java_practice.practice.productorder;

/* 
    import java.util.ArrayList;
import java.util.List;

class productorder {
  private double cost;
  private double taxPercentage;

  public productorder(double cost, double taxPercentage) {
    this.cost = cost;
    this.taxPercentage = taxPercentage;
  }

  public double getCost() {
    return cost;
  }

  public double getTax() {
    return cost * taxPercentage / 100;
  }
}

class Order {
  private List<productorder> products;

  public Order() {
    products = new ArrayList<productorder>();
  }

  public void addProduct(productorder product) {
    products.add(product);
  }

  public double getTotalCost() {
    double total = 0;
    for (productorder product : products) {
      total += product.getCost() + product.getTax();
    }
    return total;
  }
}

public class Main {
  public static void main(String[] args) {
    productorder product1 = new productorder(10, 10);
    productorder product2 = new productorder(20, 20);
    Order order = new Order();
    order.addProduct(product1);
    order.addProduct(product2);
    System.out.println("Total cost: " + order.getTotalCost());
  }
}
*/



package Facade;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private ArrayList<Product> Myproducts;
    private String PaymentMethod;

    public Order(String PaymentMethod) {
        Myproducts = new ArrayList<>();
        this.PaymentMethod = PaymentMethod;
    }
  public void addProduct(Product product) {
        Myproducts.add(product);
  }
    public ArrayList<Product> getMyproducts() {
        return Myproducts;
    }

    public void setMyproducts(ArrayList<Product> myproducts) {
        Myproducts = myproducts;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }
}

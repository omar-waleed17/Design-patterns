package Facade;

import java.util.ArrayList;

public class PaymentHandler {
    public void HandlePayment (ArrayList<Product> productlist, String paytype)
    {
        double total = 0;
        for (int i = 0; i < productlist.size(); i++)
        {
            Product product = productlist.get(i);
            total += product.getPrice();
        }
        System.out.println(paytype+ total);
    }
}

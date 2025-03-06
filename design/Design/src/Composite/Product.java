package Composite;

public class Product  implements BundleCalculator{
    private String name;
    private double price;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public double calculateBundle() {
        System.out.println(this.name);
        return price ;
    }
    public void print() {

    }
}

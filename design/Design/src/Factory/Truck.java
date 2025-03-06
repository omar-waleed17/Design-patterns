package Factory;

public class Truck extends Vehicle {
    public Truck(String Color, String model, int year) {
        super(Color, model, year);
    }
    @Override
    public void run() {
        System.out.println("TRUCK is running");
    }

    @Override
    public void engineSound() {
        System.out.println("TRUCK engine sound");
    }
}

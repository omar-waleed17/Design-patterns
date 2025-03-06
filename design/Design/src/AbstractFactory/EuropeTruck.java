package AbstractFactory;



public class EuropeTruck extends EuropanVehicle {
    public EuropeTruck(String Color, String model, int year) {
        super(Color, model, year);
    }
    @Override
    public void run() {
        System.out.println("Europan Truck is running");
    }

    @Override
    public void engineSound() {
        System.out.println(" Europan TRUCK engine sound");
    }
}

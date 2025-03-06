package AbstractFactory;

public class NorthAmericaBike extends NorthAmericaVehicle{
    public NorthAmericaBike(String Color, String model, int year) {
        super( Color, model, year);
    }



    @Override
    public void run() {
        System.out.println("North America Bike is running");
    }

    @Override
    public void engineSound() {
        System.out.println("North America Bike is engine sound");
    }
}

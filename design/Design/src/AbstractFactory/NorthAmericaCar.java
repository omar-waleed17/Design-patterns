package AbstractFactory;

public class NorthAmericaCar extends NorthAmericaVehicle{
    public NorthAmericaCar(String model, String Color, int year) {
        super(model, Color, year);
    }



    @Override
    public void run() {
        System.out.println("North America Car is running");
    }

    @Override
    public void engineSound() {
        System.out.println("North America Car is engine sound");
    }
}

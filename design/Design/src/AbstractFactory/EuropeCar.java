package AbstractFactory;



public class EuropeCar extends EuropanVehicle {
    public EuropeCar(String Color, String model, int year) {
        super(Color, model, year);
    }

    @Override
    public void run() {
        System.out.println("Europan Car is running");
    }

    @Override
    public void engineSound() {
        System.out.println("Europan Car engine sound");
    }
}

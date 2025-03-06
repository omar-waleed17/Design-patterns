package Factory;

import java.sql.SQLOutput;

public class Car extends Vehicle {
    public Car(String Color, String model, int year) {
        super(Color, model, year);
    }

    @Override
    public void run() {
        System.out.println("Car is running");
    }

    @Override
    public void engineSound() {
        System.out.println("Car engine sound");
    }
}

package AbstractFactory;

public abstract class EuropanVehicle implements Vehicle {
    private String Color;
    private String model;
    private int year;

    public EuropanVehicle(String Color, String model, int year) {
        this.Color = Color;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String make) {
        this.Color = make;
    }
    public abstract void run();
    public abstract void engineSound();

}

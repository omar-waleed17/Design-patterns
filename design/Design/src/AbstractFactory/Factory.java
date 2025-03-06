package AbstractFactory;

public interface Factory {
    public Vehicle CreateVehicle(String type, String Color, String Model, int year);
}

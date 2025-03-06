package AbstractFactory;




public class VehicleMaker {
    private Factory Myfactory;

    public VehicleMaker(Factory myfactory) {
        Myfactory = myfactory;
    }

    public Vehicle MakingVehicle(String type, String Color, String Model, int year)
    {
        Vehicle vehicle = Myfactory.CreateVehicle(type, Color, Model, year);
        vehicle.engineSound();
        vehicle.run();

        return vehicle;
    }
}
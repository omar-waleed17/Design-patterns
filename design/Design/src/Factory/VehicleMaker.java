package Factory;

public class VehicleMaker {
    private VehicleFactory vehicleFactory;
    public VehicleMaker() {
        vehicleFactory = new VehicleFactory();
    }
    public   Vehicle MakingVehicle(String type,String Color,String Model,int year)
    {
        Vehicle vehicle = vehicleFactory.CreateVehicle(type, Color, Model, year);
        vehicle.run();
        return vehicle;
    }
}

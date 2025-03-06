

package Factory;

public class VehicleFactory {
    public Vehicle CreateVehicle(String type, String Color, String Model, int year){
        if(type.equalsIgnoreCase("Car")){
            return new Car(Color,Model,year);
        }
         if(type.equalsIgnoreCase("Truck")){
            return new Truck(Color,Model,year);
        }
        return null;
    }
}

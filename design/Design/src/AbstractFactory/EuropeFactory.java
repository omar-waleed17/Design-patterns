package AbstractFactory;



public class EuropeFactory implements Factory{


    public Vehicle CreateVehicle(String type, String Color, String Model, int year){
        if(type.equalsIgnoreCase("EuropeCar")){
            return new EuropeCar(Color,Model,year);
        }
        if(type.equalsIgnoreCase("EuropeTruck")){
            return new EuropeTruck(Color,Model,year);
        }
        return null;
    }
}

package AbstractFactory;

public class NorthAmericaFactory implements Factory{
    @Override
    public Vehicle CreateVehicle(String type, String Color, String Model, int year){
        if(type.equalsIgnoreCase("NorthAmericaCar")){
            return new NorthAmericaCar(Color,Model,year);
        }
        if(type.equalsIgnoreCase("NorthAmericaBike")){
            return new NorthAmericaBike(Color,Model,year);
        }
        return null;
    }
}

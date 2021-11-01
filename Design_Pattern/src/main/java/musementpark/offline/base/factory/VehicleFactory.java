package musementpark.offline.base.factory;

public class VehicleFactory {

    public Vehicle getVehicle(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Bus")){
            return new Bus();
        } else if(shapeType.equalsIgnoreCase("Bicycle")){
            return new Bicycle();
        }
        return null;
    }
}

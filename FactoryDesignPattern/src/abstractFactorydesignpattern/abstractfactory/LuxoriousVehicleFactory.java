package abstractFactorydesignpattern.abstractfactory;

import abstractFactorydesignpattern.vehicles.MercedesBenz;
import abstractFactorydesignpattern.vehicles.RollsRoyce;
import abstractFactorydesignpattern.vehicles.Vehicle;

public class LuxoriousVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicles(String input) {
        switch(input){
            case("Rolls"):
                return new RollsRoyce();
            case("Mercedes"):
                return new MercedesBenz();
            default:
                return null;
        }
    }
}

package abstractFactorydesignpattern.abstractfactory;

import abstractFactorydesignpattern.vehicles.*;

public class OridinaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicles(String input) {
        switch(input){
            case("Tata"):
                return new TataHarrier();
            case("Hyundai"):
                return new HyundaiCreta();
            default:
                return null;
        }
    }
}

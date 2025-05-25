package abstractFactorydesignpattern;

import abstractFactorydesignpattern.abstractfactory.LuxoriousVehicleFactory;
import abstractFactorydesignpattern.abstractfactory.OridinaryVehicleFactory;
import abstractFactorydesignpattern.abstractfactory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory oridinaryVehicleFactory = new OridinaryVehicleFactory();
        System.out.println(oridinaryVehicleFactory.getVehicles("Tata").average());
        System.out.println(oridinaryVehicleFactory.getVehicles("Hyundai").average());
        VehicleFactory  luxoriousVehicleFactory = new LuxoriousVehicleFactory();
        System.out.println(luxoriousVehicleFactory.getVehicles("Rolls").average());
        System.out.println(luxoriousVehicleFactory.getVehicles("Mercedes").average());
    }
}

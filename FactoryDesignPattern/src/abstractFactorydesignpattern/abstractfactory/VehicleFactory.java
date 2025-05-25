package abstractFactorydesignpattern.abstractfactory;

import abstractFactorydesignpattern.vehicles.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicles(String input);
}

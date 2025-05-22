package withstrategypattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        Driver driver = new SportsVehicles(new SportsDrivingCapability());
        driver.driving();
        Driver driver1 = new PassengerVehicles(new NormalDrivingCapability());
        driver1.driving();
    }
}
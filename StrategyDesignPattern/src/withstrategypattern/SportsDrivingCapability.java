package withstrategypattern;

public class SportsDrivingCapability implements DrivingStrategy {
    @Override
    public void drivingStyle() {
        System.out.println("Sports Driving Capablity");
    }
}

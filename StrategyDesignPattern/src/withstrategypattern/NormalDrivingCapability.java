package withstrategypattern;

public class NormalDrivingCapability implements DrivingStrategy {
    @Override
    public void drivingStyle() {
        System.out.println("Normal Driving Capablity");
    }
}

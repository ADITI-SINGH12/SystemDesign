package withstrategypattern;

public class Driver {
    DrivingStrategy drivingStrategy;
    public Driver(DrivingStrategy drivingStrategy){
       this.drivingStrategy = drivingStrategy;
    }
   public void driving(){
        drivingStrategy.drivingStyle();
    }

    public Driver() {
    }
}

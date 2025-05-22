package withoutObserverDesignPattern;



public class Main {
    public static void main(String[] args) {
        //Without Observer Pattern
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TVDisplay tvDisplay = new TVDisplay();
        WeatherStation weatherStation = new WeatherStation(phoneDisplay, tvDisplay);
        weatherStation.setTemperature(10);



    }
}
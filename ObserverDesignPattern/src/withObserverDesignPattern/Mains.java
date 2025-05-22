package withObserverDesignPattern;

public class Mains {
    public static void main(String[] args) {


        //With observer pattern
        WeatherStationObserver tvDisplay = new TVDisplay();
        WeatherStationObserver mobileDisplay = new MobileDisplay();
        WeatherStation weatherStation = new WeatherStations();
        weatherStation.add(tvDisplay);
        weatherStation.add(mobileDisplay);
        weatherStation.setWeather("Sunny");
        weatherStation.Notify();

    }
}
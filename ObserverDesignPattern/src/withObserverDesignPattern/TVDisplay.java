package withObserverDesignPattern;

public class TVDisplay implements WeatherStationObserver{
    @Override
    public void update(String weather) {
        System.out.println("TV Display: today's weather is "+ weather);
    }
}

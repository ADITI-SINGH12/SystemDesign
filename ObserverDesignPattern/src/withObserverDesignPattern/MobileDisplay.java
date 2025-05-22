package withObserverDesignPattern;

public class MobileDisplay implements WeatherStationObserver{
    @Override
    public void update(String weather) {
        System.out.println("Mobile Display: today's weather is "+ weather);
    }
}

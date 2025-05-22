package withObserverDesignPattern;

public interface WeatherStation {

   void add(WeatherStationObserver weatherStation);
   void remove(WeatherStationObserver weatherStation);
    void Notify();
    void setWeather(String weather);
}

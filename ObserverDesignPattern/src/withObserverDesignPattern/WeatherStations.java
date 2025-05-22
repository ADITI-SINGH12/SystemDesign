package withObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStations implements WeatherStation {

List<WeatherStationObserver> weatherStationList = new ArrayList<>();
String weather;
    @Override
    public void add(WeatherStationObserver observer) {
        weatherStationList.add(observer);
    }

    @Override
    public void remove(WeatherStationObserver observer) {
        weatherStationList.add(observer);
    }

    @Override
    public void Notify() {
      for(WeatherStationObserver weatherStation: weatherStationList){
          weatherStation.update(weather);
      }
    }
    @Override
    public void setWeather(String weather) {
        this.weather = weather;
    }
}

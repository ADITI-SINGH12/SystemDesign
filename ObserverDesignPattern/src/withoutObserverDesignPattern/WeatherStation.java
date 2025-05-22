package withoutObserverDesignPattern;

public class WeatherStation {
    int temperature;
    PhoneDisplay phoneDisplay;
    TVDisplay tvDisplay;

    public WeatherStation(PhoneDisplay phoneDisplay, TVDisplay tvDisplay) {
        this.phoneDisplay = phoneDisplay;
        this.tvDisplay = tvDisplay;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        phoneDisplay.update(temperature);
        tvDisplay.update(temperature);
    }
}

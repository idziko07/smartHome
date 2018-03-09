package pl.springJava.springContext.controller;


import org.springframework.stereotype.Component;
import pl.springJava.springContext.weather.WeatherStation;

@Component
public class SpeakerController implements Controller {
    private WeatherStation weather;


    public SpeakerController(WeatherStation weather) {
        this.weather = weather;
    }

    @Override
    public void infoController() {
        System.out.println("Witam , dzisiaj jest " + weather.getTemperature() + "*C i jest " + weather.getWeather() + ". To może być dobry dzień.");
    }
}

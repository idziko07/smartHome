package pl.springJava.springContext.controller;


import org.springframework.stereotype.Component;
import pl.springJava.springContext.weather.WeatherStation;

@Component
public class SpeakerController implements Controller {

    @Override
    public void infoController(WeatherStation weather) {
        System.out.println("Witam , dzisiaj jest " + weather.getTemperature() + "*C i jest " + weather.getWeather() + ". To może być dobry dzień.");
    }
}

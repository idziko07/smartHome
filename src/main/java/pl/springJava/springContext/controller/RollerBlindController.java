package pl.springJava.springContext.controller;

import org.springframework.stereotype.Component;
import pl.springJava.springContext.weather.WeatherStation;

@Component
public class RollerBlindController implements Controller{

    @Override
    public void infoController(WeatherStation weather) {
        if (weather.getWeather().equals("słonecznie"))
            System.out.println("Jest słonecznie. Zasłaniam rolety ");
        else
            System.out.println("Jest pochmurno. Nie zasłaniam rolet ");
    }
}

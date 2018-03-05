package pl.springJava.springContext.controller;

import org.springframework.stereotype.Component;
import pl.springJava.springContext.weather.WeatherStation;

//@Component
public class FurnaceController implements Controller {
    private static final int TEMPERATURE_TURN_ON = 15;


    @Override
    public void infoController(WeatherStation weather) {
        if(weather.getTemperature() < TEMPERATURE_TURN_ON) {
            System.out.println("Jest zimno. Uruchamiam piec. ");
        }else {
            System.out.println("Jest ciepło. Nie ma potrzeby włączenia pieca ");
        }
    }
}

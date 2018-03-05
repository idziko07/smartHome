package pl.springJava.springContext.weather;

import org.springframework.stereotype.Component;

import java.util.Random;
//@Component
public class WeatherStation {
    private int temperature;
    private String weather;

    public WeatherStation() {
        System.out.println("Stacja pogodowa pobiera informacje o temperaturze.");
        Random random = new Random();
        this.temperature = random.nextInt(61)-25;

        if(random.nextBoolean()) {
            this.weather = "słonecznie";
        }else {
            this.weather = "pochmurno";
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public String  getWeather() {
        return weather;
    }
}

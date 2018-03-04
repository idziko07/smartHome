package pl.springJava.springContext.smartHome;

import org.springframework.stereotype.Component;
import pl.springJava.springContext.controller.FurnaceController;
import pl.springJava.springContext.controller.RollerBlindController;
import pl.springJava.springContext.controller.SpeakerController;
import pl.springJava.springContext.weather.WeatherStation;

@Component
public class SmartHome {

    private WeatherStation weather;
    private SpeakerController speaker;
    private FurnaceController furnace;
    private RollerBlindController rollerBlind;

    public SmartHome(WeatherStation weather, SpeakerController speaker, FurnaceController furnace, RollerBlindController rollerBlind) {
        this.weather = weather;
        this.speaker = speaker;
        this.furnace = furnace;
        this.rollerBlind = rollerBlind;
    }


    public void runController(){
      speaker.infoController(weather);
      furnace.infoController(weather);
      rollerBlind.infoController(weather);
   }
}

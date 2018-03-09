package pl.springJava.springContext.smartHome;

import org.springframework.stereotype.Component;
import pl.springJava.springContext.controller.FurnaceController;
import pl.springJava.springContext.controller.RollerBlindController;
import pl.springJava.springContext.controller.SpeakerController;
import pl.springJava.springContext.weather.WeatherStation;

@Component
public class SmartHome {

    private RollerBlindController rollerBlind;
    private FurnaceController furnace;
    private SpeakerController speaker;
    private WeatherStation weather;

    public SmartHome(RollerBlindController rollerBlind, FurnaceController furnace, SpeakerController speaker, WeatherStation weather) {
        this.rollerBlind = rollerBlind;
        this.furnace = furnace;
        this.speaker = speaker;
        this.weather = weather;
    }

    public void runController(){
        speaker.infoController();
        furnace.infoController();
        rollerBlind.infoController();
   }
}

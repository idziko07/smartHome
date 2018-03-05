package pl.springJava.springContext.smartHome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.springJava.springContext.controller.FurnaceController;
import pl.springJava.springContext.controller.RollerBlindController;
import pl.springJava.springContext.controller.SpeakerController;
import pl.springJava.springContext.weather.WeatherStation;

//@Component
public class SmartHome {


    public SmartHome(){

    }

////   @Autowired
//    public SmartHome(SpeakerController speaker, FurnaceController furnace, RollerBlindController rollerBlind) {
//        this.speaker = speaker;
//        this.furnace = furnace;
//        this.rollerBlind = rollerBlind;
//    }


    public void runController(WeatherStation weather){
       SpeakerController speaker = new SpeakerController();
       FurnaceController furnace = new FurnaceController();
       RollerBlindController rollerBlind = new RollerBlindController();
      speaker.infoController(weather);
      furnace.infoController(weather);
      rollerBlind.infoController(weather);
   }
}

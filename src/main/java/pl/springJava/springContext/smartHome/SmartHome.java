package pl.springJava.springContext.smartHome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.springJava.springContext.controller.FurnaceController;
import pl.springJava.springContext.controller.RollerBlindController;
import pl.springJava.springContext.controller.SpeakerController;

@Component
public class SmartHome {

    private SpeakerController speaker;
    private FurnaceController furnace;
    private RollerBlindController rollerBlind;

    @Autowired
    public SmartHome(SpeakerController speaker, FurnaceController furnace, RollerBlindController rollerBlind) {
        this.speaker = speaker;
        this.furnace = furnace;
        this.rollerBlind = rollerBlind;
    }


    public void runController(){
      speaker.infoController();
      furnace.infoController();
      rollerBlind.infoController();
   }
}

package musementpark.offline.entertainment.command;

import musementpark.offline.entertainment.Construct;
import musementpark.offline.entertainment.composite.Component;
import musementpark.offline.entertainment.composite.Composite;
import musementpark.offline.entertainment.composite.Leaf;
import musementpark.offline.entertainment.Construct;
import org.junit.jupiter.api.Test;

class MacroCommandTest {
    @Test
    public void MacroCommandTest() {
        Construct construct = new Construct();
        Component lf1 = construct.ConstructEntertainment();
        Entertainment entertain = new Entertainment(lf1);
        Macro myMacro = new Macro();
        myMacro.addCommand(new OpenCommand(entertain));
        myMacro.addCommand(new VolumeCommand(entertain));
        myMacro.addCommand(new LightCommand(entertain));
        EntertainmentCommand cc = new CloseCommand(entertain);
        myMacro.addCommand(cc);
        myMacro.execute();

        System.out.println("------------------------------");
        myMacro.removeCommand(cc);
        myMacro.execute();
    }
}
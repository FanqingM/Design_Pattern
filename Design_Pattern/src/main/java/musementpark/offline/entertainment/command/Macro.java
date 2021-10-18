package musementpark.offline.entertainment.command;

import java.util.ArrayList;
import java.util.List;

/*
Invoke 调用者
 */
class Macro {
    private List<EntertainmentCommand> myCommands;
    public Macro() {
        myCommands = new ArrayList<EntertainmentCommand>();
    }
    public void addCommand(EntertainmentCommand dc) {
        myCommands.add(dc);
    }
    public void removeCommand(EntertainmentCommand dc) {
        myCommands.remove(dc);
    }
    public void execute() {
        for(EntertainmentCommand dc: myCommands) {
            dc.execute();
        }
    }
    public void undo() {
        ;
    }
}

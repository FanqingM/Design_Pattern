package musementpark.offline.entertainment.command;

import musementpark.offline.entertainment.memento.Memento;
import musementpark.offline.entertainment.memento.MementoStack;

import java.util.ArrayList;
import java.util.List;

/*
Invoke 调用者
 */
public class Macro {
//    private MementoStack mementoStack;
//    private Memento memento;
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
        for(EntertainmentCommand dc: myCommands) {
            dc.undo();
        }
    }
}

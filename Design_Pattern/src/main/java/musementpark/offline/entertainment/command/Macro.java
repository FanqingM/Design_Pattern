package musementpark.offline.entertainment.command;

import java.util.ArrayList;
import java.util.List;

/*
Invoke 调用者
 */
class Macro {
    private List<DocumentCommand> myCommands;
    public Macro() {
        myCommands = new ArrayList<DocumentCommand>();
    }
    public void addCommand(DocumentCommand dc) {
        myCommands.add(dc);
    }
    public void removeCommand(DocumentCommand dc) {
        myCommands.remove(dc);
    }
    public void execute() {
        for(DocumentCommand dc: myCommands) {
            dc.execute();
        }
    }
}

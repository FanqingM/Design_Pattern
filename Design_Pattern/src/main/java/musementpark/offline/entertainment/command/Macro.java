package musementpark.offline.entertainment.command;

import musementpark.offline.entertainment.memento.Memento;
import musementpark.offline.entertainment.memento.MementoStack;

import java.util.ArrayList;
import java.util.List;

/**
 * author：FanqingM
 * description：宏命令类，用户执行的是宏命令
 */
public class Macro {

    private List<EntertainmentCommand> myCommands;

    /**
     * 构造函数
     */
    public Macro() {
        myCommands = new ArrayList<EntertainmentCommand>();
    }

    /**
     * 向宏命令中添加命令
     * @param dc
     */
    public void addCommand(
            EntertainmentCommand dc) {
        myCommands.add(dc);
    }

    /**
     * 从宏命令中移除命令
     * @param dc
     */
    public void removeCommand(EntertainmentCommand dc) {
        myCommands.remove(dc);
    }

    /**
     * 执行宏命令
     */
    public void execute() {
        for(EntertainmentCommand dc: myCommands) {
            dc.execute();
        }
    }

    /**
     * 撤回宏命令
     */
    public void undo() {
        for(EntertainmentCommand dc: myCommands) {
            dc.undo();
        }
    }
}

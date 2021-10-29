package musementpark.offline.entertainment.command;

/**
 * author：FanqingM
 * description：关机命令，继承游乐设施命令类
 */
public class CloseCommand extends EntertainmentCommand {
    /**
     * 构造函数
     * @param entertain
     */
    public CloseCommand(Entertainment entertain) {
        super(entertain);
    }

    /**
     * 执行函数
     */
    public void execute() {
        entertain.close();
    }

    /**
     * 撤销函数
     */
    public void undo() {
//        memento.restore();
        entertain.undo();
    }

    /**
     * 存档函数
     */
    public void makeBackup() {
        memento = entertain.createMemento();
    }
}
package musementpark.offline.entertainment.command;
/**
 * author：FanqingM
 * description：开机命令，继承游乐设施命令类
 */
public class OpenCommand extends EntertainmentCommand {
    /**
     * 构造函数
     * @param entertain
     */
    public OpenCommand(Entertainment entertain) {
        super(entertain);
    }

    /**
     * 执行命令
     */
    public void execute() {
        entertain.open();
    }

    /**
     * 撤销命令
     */
    public void undo() {
        entertain.undo();
    }

    /**
     * 存档
     */
    public void makeBackup() {
        memento = entertain.createMemento();
    }
}

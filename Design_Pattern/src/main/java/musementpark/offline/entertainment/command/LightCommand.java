package musementpark.offline.entertainment.command;

/**
 * author：FanqingM
 * description：增强灯光命令，继承游乐设施命令类
 */
public class LightCommand extends EntertainmentCommand {
    /**
     * 构造函数
     * @param entertain
     */
    public LightCommand(Entertainment entertain) {
        super(entertain);
    }

    /**
     * 执行命令函数
     */
    public void execute() {
        entertain.lightUp();
    }

    /**
     * 撤回
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

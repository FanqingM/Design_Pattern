package musementpark.offline.entertainment.command;

import musementpark.offline.entertainment.memento.Memento;
/**
 * author：FanqingM
 * description：抽象命令类，包括命令和备忘录
 */
public abstract class EntertainmentCommand {
    protected Memento memento;
    protected Entertainment entertain;

    /**
     * 构造函数
     * @param entertain
     */
    public EntertainmentCommand(Entertainment entertain) {

        this.entertain = entertain;
    }

    /**
     * 执行命令
     */
    public abstract void execute();

    /**
     * 撤销命令
     */
    public abstract void undo();

    /**
     * 存档
     */
    public abstract void makeBackup();
}







package musementpark.offline.entertainment.command;

public class CloseCommand extends EntertainmentCommand {
    public CloseCommand(Entertainment entertain) {
        super(entertain);
    }
    public void execute() {
        entertain.close();
    }
    public void undo() {
//        memento.restore();
        entertain.undo();
    }
    public void makeBackup() {
        memento = entertain.createMemento();
    }
}
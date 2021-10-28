package musementpark.offline.entertainment.command;

public class OpenCommand extends EntertainmentCommand {
    public OpenCommand(Entertainment entertain) {
        super(entertain);
    }
    public void execute() {
        entertain.open();
    }
    public void undo() {
        entertain.undo();
    }
    public void makeBackup() {
        memento = entertain.createMemento();
    }
}

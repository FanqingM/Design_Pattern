package musementpark.offline.entertainment.command;

public class LightCommand extends EntertainmentCommand {
    public LightCommand(Entertainment entertain) {
        super(entertain);
    }
    public void execute() {
        entertain.lightUp();
    }
    public void undo() {
        entertain.undo();
    }
    public void makeBackup() {
        memento = entertain.createMemento();
    }
}

package musementpark.offline.entertainment.command;

public class VolumeCommand extends EntertainmentCommand {
    public VolumeCommand(Entertainment entertain) {
        super(entertain);
    }
    public void execute() {
        entertain.volumeUp();
    }
    public void undo() {
        entertain.undo();
    }
    public void makeBackup() {
        memento = entertain.createMemento();
    }
}

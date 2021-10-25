package musementpark.offline.entertainment.command;

import musementpark.offline.entertainment.memento.Memento;

public abstract class EntertainmentCommand {
    protected Memento memento;
    protected Entertainment entertain;
    public EntertainmentCommand(Entertainment entertain) {
        this.entertain = entertain;
    }
    public abstract void execute();
    public abstract void undo();
    public abstract void makeBackup();
}







package musementpark.offline.entertainment.command;

abstract class EntertainmentCommand {
    protected Entermainment doc;
    public EntertainmentCommand(Entermainment doc) {
        this.doc = doc;
    }
    public abstract void execute();
    public abstract void undo();
}

class CloseCommand extends EntertainmentCommand {
    public CloseCommand(Entermainment doc) {
        super(doc);
    }
    public void execute() {
        doc.close();
    }
    public void undo() {
        doc.undo();
    }
}

class OpenCommand extends EntertainmentCommand {
    public OpenCommand(Entermainment doc) {
        super(doc);
    }
    public void execute() {
        doc.open();
    }
    public void undo() {
        doc.undo();
    }
}

class VolumeCommand extends EntertainmentCommand {
    public VolumeCommand(Entermainment doc) {
        super(doc);
    }
    public void execute() {
        doc.volumnUp();
    }
    public void undo() {
        doc.undo();
    }
}

class LightCommand extends EntertainmentCommand {
    public LightCommand(Entermainment doc) {
        super(doc);
    }
    public void execute() {
        doc.lightUp();
    }
    public void undo() {
        doc.undo();
    }
}

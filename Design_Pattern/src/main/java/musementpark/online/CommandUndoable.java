package online;

public abstract class CommandUndoable implements Command{
    protected Object _memento;

    public abstract void undo();
}
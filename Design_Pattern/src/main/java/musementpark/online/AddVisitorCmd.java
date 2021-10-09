package online;

public class AddVisitorCmd extends CommandUndoable{
    private Data _receiver;
    private Visitor _para;

    AddVisitorCmd(Data data,Visitor visitor)
    {
        this._receiver=data;
        _para=visitor;
    }

    @Override
    public void execute() {
        _receiver.addVisitor(_para);
        this._memento=_receiver.clone();
    }

    @Override
    public void undo() {
        if(_memento instanceof Data) {
            _receiver = (Data)((Data) _memento).clone();
        }
    }
};

package online;

public class Visitor {
    private Type _type;
    private String _name;
    private Ticket _ticket;

    Visitor(Type type, String name)
    {
        _type=type;
        _name=name;
    }

    public Type getType()
    {
        return _type;
    }
    public void setTicket(Ticket ticket)
    {
        _ticket=ticket;
    }
}

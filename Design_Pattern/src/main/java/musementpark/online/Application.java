package online;

public class Application {
    private TicketFactory myTicketFactory;
    private Data data = new Data();

    private static final Application _singletonApp=new Application();
    public static Application getInstance(){
        return _singletonApp;
    }

    private Application()
    {
        int price=100;
        double childDiscount=0.5;
        double elderDiscount=0.4;
        myTicketFactory = new TicketFactory.Builder(price).set_childDiscount(childDiscount).set_freeDiscount(elderDiscount).build();
    }
    private TypeDecider getTypeDeciderChain(){
        TypeDecider free=new FreeTypeDecider(12);
        TypeDecider child=new ChildTypeDecider(18);
        TypeDecider adult=new AdultTypeDecider(200);
        free.setNext(child);
        child.setNext(adult);
        return free;
    }

    public Ticket buyTicket(Visitor visitor)
    {
        Ticket ticket = myTicketFactory.getTicket(visitor.getType(),visitor);
        visitor.setTicket(ticket);
        return ticket;
    }

    public Visitor register(int age,String name)
    {
        TypeDecider myChain = getTypeDeciderChain();
        Visitor visitor = new Visitor(myChain.getType(age),name);
        Command command=new AddVisitorCmd(data,visitor);
        command.execute();
        return visitor;
    }
}

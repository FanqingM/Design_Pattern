package online;

public class AdultTicket extends Ticket{
    AdultTicket(Visitor owner,int price) {
        super(owner,price);
    }

    @Override
    public double calPrice() {
        return 0;
    }
}

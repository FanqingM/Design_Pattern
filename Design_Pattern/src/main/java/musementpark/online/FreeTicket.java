package online;

public class FreeTicket extends Ticket{
    private double _discount;

    FreeTicket(Visitor owner,int price, double discount){
        super(owner,price);
        this._discount=discount;
    }
    @Override
    public double calPrice() {
        return 0;
    }
}

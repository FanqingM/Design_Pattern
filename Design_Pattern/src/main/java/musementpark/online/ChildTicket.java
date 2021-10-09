package online;

public class ChildTicket extends Ticket{
    private double _discount;
    ChildTicket(Visitor owner,int price,double discount) {
        super(owner,price);
        this._discount=discount;
    }

    @Override
    public double calPrice() {
        return getFullPrice()*_discount;
    }
}

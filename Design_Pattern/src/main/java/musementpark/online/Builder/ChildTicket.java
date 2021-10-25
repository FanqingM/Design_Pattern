package musementpark.online.Builder;

public class ChildTicket extends Ticket{
    private double _discount;
    ChildTicket(int price,double discount) {
        super(price);
        this._discount=discount;
    }

    @Override
    public double calPrice() {
        return getFullPrice()*_discount;
    }

    @Override
    public String getInfo() {
        return "ChildTicket的price是"+getFullPrice()+",折扣是"+_discount;
    }
}

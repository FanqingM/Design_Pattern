package musementpark.online.Builder;

public class ElderTicket extends Ticket{
    private double _discount;

    ElderTicket(int price, double discount){
        super(price);
        this._discount=discount;
    }
    @Override
    public double calPrice() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "FreeTicket的price是"+getFullPrice()+",折扣是"+_discount;

    }
}

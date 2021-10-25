package musementpark.online.Builder;

public class AdultTicket extends Ticket{
    AdultTicket(int price) {
        super(price);
    }

    @Override
    public double calPrice() {
        return getFullPrice();
    }

    @Override
    public String getInfo() {
        return "AdultTicket的price是"+getFullPrice();
    }
}

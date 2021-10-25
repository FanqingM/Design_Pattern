package musementpark.online.Builder;

public class TicketFactory {
    private int _fullPrice;
    private double _childDiscount;
    private double _elderDiscount;

    private void set(Builder builder)
    {
        this._fullPrice=builder._fullPrice;
        this._childDiscount= builder._childDiscount;
        this._elderDiscount=builder._elderDiscount;
    }

    public static class Builder{
        private int _fullPrice;
        private double _childDiscount;
        private double _elderDiscount;

        Builder(int price)
        {
            _fullPrice=price;
        }
        public Builder set_childDiscount(double cDiscount)
        {
            _childDiscount=cDiscount;
            return this;
        }
        public Builder set_elderDiscount(double fDiscount)
        {
            _elderDiscount=fDiscount;
            return this;
        }
        public TicketFactory build()
        {
            _singleton.set(this);
            return _singleton;
        }
    }


    //ban
    private TicketFactory(){};
    private static final TicketFactory _singleton = new TicketFactory();

    public TicketFactory getInstance()
    {
        return _singleton;
    }

    public Ticket getTicket(String type)
    {
        switch (type.toUpperCase()) {
            case "CHILD":
                return new ChildTicket(_fullPrice,_childDiscount);
            case "ADULT":
                return new AdultTicket(_fullPrice);
            case "ELDER":
                return new ElderTicket(_fullPrice,_elderDiscount);
            default:
                return null;
        }
    }
}

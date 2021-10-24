package musementpark.online.Builder;

import musementpark.online.Prototype.Visitor;

import java.util.Locale;

public class TicketFactory {
    private int _fullPrice;
    private double _childDiscount;
    private double _freeDiscount;

    private void set(Builder builder)
    {
        this._fullPrice=builder._fullPrice;
        this._childDiscount= builder._childDiscount;
        this._freeDiscount=builder._freeDiscount;
    }

    public static class Builder{
        private int _fullPrice;
        private double _childDiscount;
        private double _freeDiscount;

        Builder(int price)
        {
            _fullPrice=price;
        }
        public Builder set_childDiscount(double cDiscount)
        {
            _childDiscount=cDiscount;
            return this;
        }
        public Builder set_freeDiscount(double fDiscount)
        {
            _freeDiscount=fDiscount;
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

    public Ticket getTicket(String type,Visitor owner)
    {
        switch (type.toUpperCase()) {
            case "CHILD":
                return new ChildTicket(owner,_fullPrice,_childDiscount);
            case "ADULT":
                return new AdultTicket(owner,_fullPrice);
            case "FREE":
                return new FreeTicket(owner,_fullPrice,_freeDiscount);
            default:
                return null;
        }
    }
}

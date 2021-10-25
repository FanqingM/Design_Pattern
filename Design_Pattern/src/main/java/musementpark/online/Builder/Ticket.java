package musementpark.online.Builder;

import musementpark.online.Prototype.Visitor;

public abstract class Ticket {
    private int _fullPrice;
    private Visitor _owner;

    public Ticket(Visitor owner,int price){
        this._fullPrice=price;
        this._owner=owner;
    }

    protected int getFullPrice(){
        return _fullPrice;
    }
    public abstract double calPrice();

}

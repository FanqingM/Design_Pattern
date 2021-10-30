package musementpark.online.Builder;

public abstract class Ticket {
    private int _fullPrice;
    public Ticket(int price){
        this._fullPrice=price;
    }

    protected int getFullPrice(){
        return _fullPrice;
    }
    public abstract double calPrice();

    public abstract String getInfo();
    public void showInfo()
    {
        System.out.println(getInfo()+",总价是"+calPrice());
    }
}

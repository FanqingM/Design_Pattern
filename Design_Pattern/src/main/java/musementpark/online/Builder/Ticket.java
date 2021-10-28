package musementpark.online.Builder;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

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
//        Print.print(new PrintInfo(
//                "TicketFactory.Builder",
//                "2(随后修改)",
//                "set_childDiscount  set_elderDiscount  build",
//                "在本例中，使用了静态内部类来实现建造者模式，分别通过set_elderDiscount函数与set_childDiscount两个函数对老年人与儿童的折扣进行初始化，然后通过build函数将其赋给Ticket的工厂。"
//        ));
        System.out.println(getInfo()+",总价是"+calPrice());
    }
}

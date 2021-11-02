package musementpark.online.TemplatePattern;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author: PandaLYZ
 * description:该类为Ticket类型的抽象类，其派生出了AdultTicket、ChildTicket、ElderTicket三个子类
 */
public abstract class Ticket {
    private int _fullPrice;
    /**
     * description:构造函数，初始化了_fullPrice变量
     */
    public Ticket(int price){
        this._fullPrice=price;
    }

    /**
     * description:该方法返回总价
     * @return 返回_fullPrice变量的值
     */
    protected int getFullPrice(){
        return _fullPrice;
    }

    /**
     * description:该方法返回总价
     * @return 返回折扣
     */
    public abstract double getDiscount();

    /**
     * description: 抽象方法，供子类实现
     * @return double 供子类实现
     */
    public double calPrice()
    {
        return getDiscount()*_fullPrice;
    }

    /**
     * description: 抽象方法，供子类实现
     * @return 返回一个字符串
     */
    public String getInfo()
    {
        return "price是"+getFullPrice()+",折扣是"+getDiscount();
    }

    /**
     * description: 该方法用来打印总价
     */
    public void showInfo()
    {
        Print.print(new PrintInfo(
                "Ticket",
                String.valueOf(System.identityHashCode(this)),
                "showInfo",
                getInfo()+",总价是"+calPrice()
        ));
    }
}
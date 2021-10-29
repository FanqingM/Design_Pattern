package musementpark.online.Builder;

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
     * description: 抽象方法，供子类实现
     * @return double 供子类实现
     */
    public abstract double calPrice();

    /**
     * description: 抽象方法，供子类实现
     * @return 返回一个字符串
     */
    public abstract String getInfo();

    /**
     * description: 该方法用来打印总价
     */
    public void showInfo()
    {
        System.out.println(getInfo()+",总价是"+calPrice());
    }
}

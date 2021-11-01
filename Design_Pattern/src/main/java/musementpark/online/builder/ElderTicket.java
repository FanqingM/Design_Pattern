package musementpark.online.builder;

/**
 * author: PandaLYZ
 * description:该类为ElderTicket类，继承了Ticket类，处理老年票种相关信息
 */
public class ElderTicket extends Ticket{
    private double _discount;

    /**
     * description:构造函数
     * @param price 总价
     * @param discount 折扣
     */
    ElderTicket(int price, double discount){
        super(price);
        this._discount=discount;
    }

    /**
     * description：计算老年票价
     * @return 返回老年票价
     */
    @Override
    public double calPrice() {
        return getFullPrice()*_discount;
    }

    /**
     * description: 得到老年票相关信息
     * @return 返回一个字符串，表明老年的票价和折扣
     */
    @Override
    public String getInfo() {
        return "FreeTicket的price是"+getFullPrice()+",折扣是"+_discount;

    }
}

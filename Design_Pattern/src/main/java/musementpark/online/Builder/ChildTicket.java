package musementpark.online.Builder;

/**
 * author: PandaLYZ
 * description:该类为ChildTicket类，继承了Ticket类，处理儿童票种相关信息
 */
public class ChildTicket extends Ticket{
    private double _discount;
    /**
     * description:构造函数
     * @param price 总价
     * @param discount 折扣
     */
    ChildTicket(int price,double discount) {
        super(price);
        this._discount=discount;
    }
    /**
     * description：计算儿童票价
     * @return 返回儿童票价
     */
    @Override
    public double calPrice() {
        return getFullPrice()*_discount;
    }
    /**
     * description: 得到儿童票相关信息
     * @return 返回一个字符串，表明儿童的票价和折扣
     */
    @Override
    public String getInfo() {
        return "ChildTicket的price是"+getFullPrice()+",折扣是"+_discount;
    }
}

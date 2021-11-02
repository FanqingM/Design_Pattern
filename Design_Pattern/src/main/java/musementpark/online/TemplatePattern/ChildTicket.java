package musementpark.online.TemplatePattern;

/**
 * author: PandaLYZ
 * description:该类为ChildTicket类，继承了Ticket类，处理儿童票种相关信息
 */
public class ChildTicket extends Ticket {
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

    @Override
    public double getDiscount() {
        return _discount;
    }
}

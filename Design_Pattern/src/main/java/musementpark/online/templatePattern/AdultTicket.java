package musementpark.online.templatePattern;
/**
 * author: PandaLYZ
 * description:该类为AdultTicket类，继承了Ticket类，处理成人票种相关信息
 */
public class AdultTicket extends Ticket {
    /**
     * description:构造函数，成人票是全价，没有折扣
     * @param price 总价
     */
    AdultTicket(int price) {
        super(price);
    }

    @Override
    public double getDiscount() {
        return 1;
    }

}
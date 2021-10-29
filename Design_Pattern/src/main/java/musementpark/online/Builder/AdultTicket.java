package musementpark.online.Builder;

/**
 * author: PandaLYZ
 * description:该类为AdultTicket类，继承了Ticket类，处理成人票种相关信息
 */
public class AdultTicket extends Ticket{
    /**
     * description:构造函数，成人票是全价，没有折扣
     * @param price 总价
     */
    AdultTicket(int price) {
        super(price);
    }

    /**
     * description：计算成人票价
     * @return 返回成人票价
     */
    @Override
    public double calPrice() {
        return getFullPrice();
    }
    /**
     * description: 得到成年票相关信息
     * @return 返回一个字符串，表明成年人的票价
     */
    @Override
    public String getInfo() {
        return "AdultTicket的price是"+getFullPrice();
    }
}

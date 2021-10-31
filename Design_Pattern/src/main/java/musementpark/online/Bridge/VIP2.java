package musementpark.online.Bridge;

/**
 * author: DannyXSC
 * description:该类是一个表示用户身份为VIP2的类，继承了父类Status类，其最低消费为200元
 */
public class VIP2 extends Status {
    public static final int minConsumption = 200;
    /**
     * description:获取对应身份等级的折扣，重写了父类中的方法
     * @return double 返回折扣数0.8折
     */
    @Override
    public double getDiscount() {
        return 0.8;
    }
    @Override
    public Boolean getAuthority() { return false; }
}

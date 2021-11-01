package musementpark.online.bridge;

/**
 * author: DannyXSC
 * description:该类是一个表示用户身份为common的类，继承了父类Status类，其最低消费为0元
 */
public class Common extends Status {
    public static final int minConsumption = 0;
    /**
     * description:获取对应身份等级的折扣，重写了父类中的方法
     * @return double 返回折扣数1折
     */
    @Override
    public double getDiscount() {
        return 1;
    }

    @Override
    public Boolean getAuthority() { return false; }
}

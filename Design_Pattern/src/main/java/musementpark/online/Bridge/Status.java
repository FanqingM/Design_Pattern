package musementpark.online.Bridge;

/**
 * author: DannyXSC
 * description:该类是一个表示用户身份的抽象类，不同身份可以获得不同折扣
 */
public abstract class Status {
    /**
     * description:获取对应身份等级的折扣
     * @return double 返回折扣数
     */
    public abstract double getDiscount();
    /**
     * description:获取对应身份等级的折扣
     * @return Boolean 返回
     */
    public abstract Boolean getAuthority();
}

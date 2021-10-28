package musementpark.online.AbstractFactory;

/**
 * author: DannyXSC
 * description: RollerCoasterFactory类继承了Gift类，代表RollerCoasterGift类型的Gift
 */
public class RollerCoasterGift extends Gift{
    /**
     * description: 构造函数
     */
    public RollerCoasterGift() {
        super("过山车礼品");
        System.out.println("创建了"+name);
    }
}

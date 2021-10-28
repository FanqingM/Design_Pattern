package musementpark.online.AbstractFactory;

/**
 * author: DannyXSC
 * description: WhirligigGift类继承了Gift类，代表WhirligigGift类型的Gift
 */
public class WhirligigGift extends Gift{
    /**
     * description: 构造函数
     */
    public WhirligigGift() {
        super("旋转木马礼品");
        System.out.println("创建了"+name);

    }
}

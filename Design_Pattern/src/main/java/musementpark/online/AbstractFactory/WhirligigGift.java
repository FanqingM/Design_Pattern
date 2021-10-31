package musementpark.online.AbstractFactory;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

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
        Print.print(new PrintInfo(
                "WhirligigGift",
                String.valueOf(System.identityHashCode(this)),
                "WhirligigGift",
                "创建了"+name
        ));
    }
}

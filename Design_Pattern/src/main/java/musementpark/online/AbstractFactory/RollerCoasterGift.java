package musementpark.online.AbstractFactory;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author: DannyXSC
 * description: RollerCoasterGift类继承了Gift类，代表RollerCoasterGift类型的Gift
 */
public class RollerCoasterGift extends Gift{
    /**
     * description: 构造函数
     */
    public RollerCoasterGift() {
        super("过山车礼品");
        Print.print(new PrintInfo(
                "RollerCoasterGift",
                String.valueOf(System.identityHashCode(this)),
                "RollerCoasterGift",
                "创建了"+name
        ));
    }
}

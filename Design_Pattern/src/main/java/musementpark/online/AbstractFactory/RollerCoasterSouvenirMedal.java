package musementpark.online.AbstractFactory;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author: DannyXSC
 * description: RollerCoasterSouvenirMedal类继承了SouvenirMedal类，代表RollerCoasterSouvenirMedal类型的SouvenirMedal
 */
public class RollerCoasterSouvenirMedal extends SouvenirMedal{
    /**
     * description: 构造函数
     */
    public RollerCoasterSouvenirMedal() {
        super("过山车纪念章");
        Print.print(new PrintInfo(
                "RollerCoasterSouvenirMedal",
                String.valueOf(System.identityHashCode(this)),
                "RollerCoasterSouvenirMedal",
                "创建了"+name
        ));
    }
}

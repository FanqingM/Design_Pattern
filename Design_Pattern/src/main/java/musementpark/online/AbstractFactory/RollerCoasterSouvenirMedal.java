package musementpark.online.AbstractFactory;

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
        System.out.println("创建了"+name);

    }
}

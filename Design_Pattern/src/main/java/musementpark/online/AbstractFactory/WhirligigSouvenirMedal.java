package musementpark.online.AbstractFactory;

/**
 * author: DannyXSC
 * description: WhirligigSouvenirMedal类继承SouvenirMedal类，代表WhirligigSouvenirMedal类型的SouvenirMedal
 */
public class WhirligigSouvenirMedal extends SouvenirMedal{
    /**
     * description: 构造函数
     */
    public WhirligigSouvenirMedal() {
        super("旋转木马纪念章");
        System.out.println("创建了"+name);

    }
}

package musementpark.online.abstractFactory;

/**
 * author: DannyXSC
 * description: SouvenirMedal类继承Item类，表示纪念品奖牌
 */
public abstract class SouvenirMedal extends Item{
    /**
     * description: 构造函数
     * @param name String
     */
    public SouvenirMedal(String name) {
        super(name);
    }
}

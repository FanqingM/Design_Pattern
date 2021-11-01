package musementpark.online.abstractFactory;

/**
 * author: DannyXSC
 * description: WhirligigFactory类实现了AbstractFactory接口，并对getGift、getSouvenirMedal两个方法进行了重写
 */
public class WhirligigFactory implements AbstractFactory {
    /**
     * description: 返回一个WhirligigGift类型的对象
     * @return Gift
     */
    @Override
    public Gift getGift() {
        return new WhirligigGift();
    }
    /**
     * description: 返回一个WhirligigSouvenirMedal类型的对象
     * @return SouvenirMedal
     */
    @Override
    public SouvenirMedal getSouvenirMedal() {
        return new WhirligigSouvenirMedal();
    }
}

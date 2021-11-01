package musementpark.online.abstractFactory;

/**
 * author: DannyXSC
 * description: 该接口是抽象工厂的接口，提供getGift、getSouvenirMedal两个方法供实现该接口的类完成
 */

public interface AbstractFactory {
    /**
     * description: 该方法供实现该接口的工厂完成
     * @return Gift
     */
    public Gift getGift();

    /**
     * description: 该方法供实现该接口的工厂完成
     * @return SouvenirMedal
     */
    public SouvenirMedal getSouvenirMedal();
}

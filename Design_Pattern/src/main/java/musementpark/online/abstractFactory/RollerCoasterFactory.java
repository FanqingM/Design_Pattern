package musementpark.online.abstractFactory;

/**
 * author: DannyXSC
 * description: RollerCoasterFactory类实现了AbstractFactory接口，并对getGift、getSouvenirMedal两个方法进行了重写
 */
public class RollerCoasterFactory implements AbstractFactory{
    /**
     * description: 返回一个RollerCoasterGift类型的对象
     * @return Gift
     */
    @Override
    public Gift getGift() {
        return new RollerCoasterGift();
    }
    /**
     * description: 返回一个RollerCoasterSouvenirMedal类型的对象
     * @return SouvenirMedal
     */
    @Override
    public SouvenirMedal getSouvenirMedal() {
        return new RollerCoasterSouvenirMedal();
    }
}

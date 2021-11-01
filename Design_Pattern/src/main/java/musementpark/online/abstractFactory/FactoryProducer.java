package musementpark.online.abstractFactory;



/**
 * author: DannyXSC
 * description: 该类的主要功能是根据参数来生成一个派生于抽象工厂的具体工厂，比如 RollerCoasterFactory或 WhirligigFactory
 */
public class FactoryProducer{
    /**
     * description: 返回一个派生于抽象工厂的具体工厂
     * @param choice String  表示选择生成的工厂的类名
     * @return  AbstractFactory
     */
    public static AbstractFactory getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("ROLLERCOASTER")){
            return new RollerCoasterFactory();
        }else if(choice.equalsIgnoreCase("WHIRLIGIG")){
            return new WhirligigFactory();
        }
        return null;
    }
}

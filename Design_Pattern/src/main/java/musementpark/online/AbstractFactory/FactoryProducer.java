package musementpark.online.AbstractFactory;

public class FactoryProducer{
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

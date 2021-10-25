package musementpark.online.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice)
    {
        if (choice.equalsIgnoreCase("adult"))
        {
            return AdultFactory.getInstance();
        }else if(choice.equalsIgnoreCase("child"))
        {
            return ChildFactory.getInstance();
        }
        return null;
    }
}

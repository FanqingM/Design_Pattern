package musementpark.online.Facade;

public class RollerCoaster {
    private static RollerCoaster _singleton = new RollerCoaster();
    private RollerCoaster(){}
    public static RollerCoaster getInstance()
    {
        return _singleton;
    }

    void queueUp()
    {
        System.out.println("加入RollerCoaster排队队列");
    }
}

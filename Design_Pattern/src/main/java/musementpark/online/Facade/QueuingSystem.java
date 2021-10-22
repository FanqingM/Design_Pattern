package musementpark.online.Facade;

public class QueuingSystem {
    private static QueuingSystem _singleton = new QueuingSystem();
    private QueuingSystem(){}
    public static QueuingSystem getInstance()
    {
        return _singleton;
    }

    RollerCoaster rollerCoaster = RollerCoaster.getInstance();
    Whirligig whirligig = Whirligig.getInstance();

    void queueUp()
    {
        rollerCoaster.queueUp();
        whirligig.queueUp();
    }

}

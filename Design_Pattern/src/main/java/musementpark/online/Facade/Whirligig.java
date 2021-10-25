package musementpark.online.Facade;

public class Whirligig {
    private static Whirligig _singleton = new Whirligig();
    private Whirligig(){}
    public static Whirligig getInstance()
    {
        return _singleton;
    }

    void queueUp()
    {
        System.out.println("加入Whirligig排队队列");
    }
}

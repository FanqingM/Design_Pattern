package musementpark.online.Facade;

import musementpark.online.Prototype.Visitor;

import java.util.Queue;

public class Whirligig extends AmusementDevice{
    private static Whirligig _singleton = new Whirligig();
    private Whirligig(){}
    public static Whirligig getInstance()
    {
        return _singleton;
    }
    @Override
    public void play(Queue<Visitor> visitorList) {
        System.out.println("正在玩旋转木马");
    }
}

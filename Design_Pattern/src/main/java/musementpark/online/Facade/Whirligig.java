package musementpark.online.Facade;

import musementpark.online.Prototype.Visitor;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

import java.util.Queue;

/**
 * author: PandaLYZ
 * description:该类为Whirligig类，继承了AmusementDevice类，采用单例模式实现
 */
public class Whirligig extends AmusementDevice{
    private static Whirligig _singleton = new Whirligig();

    /**
     * description: 静态构造函数
     */
    private Whirligig(){}

    /**
     * description: 获取该类的唯一实例
     * @return _singleton
     */
    public static Whirligig getInstance()
    {
        return _singleton;
    }

    /**
     * description: 该方法重写了父类的方法，打印正在玩旋转木马的信息
     * @param visitorList 待游玩的游客
     */
    @Override
    public void play(Queue<Visitor> visitorList) {
        Print.print(new PrintInfo(
                "Whirligig",
                String.valueOf(System.identityHashCode(this)),
                "play",
                "正在玩旋转木马"
        ));
    }
}

package musementpark.online.facade;

import musementpark.online.adapter.AmusementQueue;
import musementpark.online.prototype.Visitor;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

import java.util.Queue;

/**
 * author: PandaLYZ
 * description:该类为AmusementDevice类，是一个抽象类，派生出了具体的游乐设施类，比如Whirligig类（旋转木马类）
 */
public abstract class AmusementDevice {
    private AmusementQueue _queue = new AmusementQueue();
    private Detector _detector = new Detector();
    private static final int maxCapacity = 5;

    /**
     * description: 当有游客加入某一游乐设施的排队队列时，调用该方法，并打印出相关语句
     * @param visitor Visitor类型，传入要加入队列的游客
     */
    public void queueUp(Visitor visitor)
    {
        Print.print(new PrintInfo(
                "AmusementDevice",
                String.valueOf(System.identityHashCode(this)),
                "queueUp",
                visitor.getClass().getSimpleName()+"加入队伍"
        ));
        _queue.add(visitor);
    }

    /**
     * description:该方法为游乐设施运行的方法，运行时首先要判断排队队列是否为空，其次要进行运行前检测，最后是从队列中取出前5名游客，最后运行。
     * 该方法也封装了游乐设施运行的全部流程，也采用了表观模式
     */
    public void run()
    {
        if(_queue.isEmpty()==true)
            return;
        _detector.detect(this);
        Queue<Visitor> visitorList= _queue.get(maxCapacity);
        play(visitorList);
    }

    /**
     * description: 该方法是游客游乐设施时所调用
     * @param visitorList 待游玩的游客
     */
    public abstract void play(Queue<Visitor> visitorList);
}

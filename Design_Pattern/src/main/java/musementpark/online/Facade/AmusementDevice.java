package musementpark.online.Facade;

import musementpark.online.Adapter.AmusementQueue;
import musementpark.online.Prototype.Visitor;

import java.util.Queue;

public abstract class AmusementDevice {
    private AmusementQueue _queue = new AmusementQueue();
    private Detector _detector = new Detector();
    private static final int maxCapacity = 5;

    public void queueUp(Visitor visitor)
    {
        System.out.println(visitor.getClass().getSimpleName()+"加入队伍");
        _queue.add(visitor);
    }
    public void run()
    {
        if(_queue.isEmpty()==true)
            return;
        _detector.detect(this);
        Queue<Visitor> visitorList= _queue.get(maxCapacity);
        play(visitorList);
    }

    public abstract void play(Queue<Visitor> visitorList);
}

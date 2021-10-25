package musementpark.online.Adapter;

import musementpark.online.Prototype.Visitor;

import java.util.LinkedList;
import java.util.Queue;

public class AmusementQueue {
    private Queue<Visitor> _queue = new LinkedList<>();

    public boolean isEmpty()
    {
        return _queue.isEmpty();
    }
    public void add(Visitor visitor)
    {
        _queue.offer(visitor);
    }
    public Queue<Visitor> get(int n)
    {
        Queue<Visitor> ret=new LinkedList<>();
        for(int i=0;i<n &&_queue.isEmpty()==false;i++)
            ret.offer(_queue.poll());
        return ret;
    }
}

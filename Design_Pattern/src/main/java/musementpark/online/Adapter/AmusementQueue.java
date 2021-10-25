package musementpark.online.Adapter;

import musementpark.online.Prototype.Visitor;

import java.util.LinkedList;
import java.util.Queue;

public class AmusementQueue {
    private Queue<Visitor> _queue = new LinkedList<>();

    public boolean isEmpty()
    {
        System.out.println("队列"+(_queue.isEmpty()?"是":"不是"+"空的"));
        return _queue.isEmpty();
    }
    public void add(Visitor visitor)
    {
        _queue.offer(visitor);
        System.out.println("增加游客"+visitor.getClass().getSimpleName());
    }
    public Queue<Visitor> get(int n)
    {
        Queue<Visitor> ret=new LinkedList<>();
        for(int i=0;i<n &&_queue.isEmpty()==false;i++)
            ret.offer(_queue.poll());
        System.out.println("获取前"+n+"个游客");
        return ret;
    }
}

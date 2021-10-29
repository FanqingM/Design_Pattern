package musementpark.online.Adapter;

import musementpark.online.Prototype.Visitor;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * author: DannyXSC
 * description: AmusementQueue类是游乐设施的排队队列类，其内部维护一个Visitor类型的队列，其内部的方法完成了适配器模式，重新重装了java库中的queue的部分方法，供其他类(AmusementDevice类)调用
 */
public class AmusementQueue {
    private Queue<Visitor> _queue = new LinkedList<>();

    /**
     * description: 该函数封装了Queue中的isEmpty方法，功能是判断队列是否为空
     * @return boolean 返回一个布尔变量，1表示队列为空，0表示队列不为空
     */
    public boolean isEmpty()
    {
        Print.print(new PrintInfo(
                "AmusementQueue",
                String.valueOf(System.identityHashCode(this)),
                "isEmpty",
                "队列"+(_queue.isEmpty()?"是":"不是"+"空的")
        ));
        return _queue.isEmpty();
    }

    /**
     * description:该函数封装了Queue中的offer方法，功能是向对列中添加新成员
     * @param visitor 参数为Visitor类型变量
     */
    public void add(Visitor visitor)
    {
        _queue.offer(visitor);
        Print.print(new PrintInfo(
                "AmusementQueue",
                String.valueOf(System.identityHashCode(this)),
                "add",
                "增加游客"+visitor.getClass().getSimpleName()
        ));
    }

    /**
     * description:该函数封装了Queue中的poll方法，功能是获取队列中的前n个成员
     * @param n n表示要获取的队列中的成员数量
     * @return 返回一个队列，其中为类内_queue队列中的前n个成员
     */
    public Queue<Visitor> get(int n)
    {
        Queue<Visitor> ret=new LinkedList<>();
        for(int i=0;i<n &&_queue.isEmpty()==false;i++)
            ret.offer(_queue.poll());
        Print.print(new PrintInfo(
                "AmusementQueue",
                String.valueOf(System.identityHashCode(this)),
                "get",
                "获取前"+n+"个游客"
        ));
        return ret;
    }
}

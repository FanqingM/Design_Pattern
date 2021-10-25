package musementpark.online.Prototype;

import musementpark.online.Bridge.Common;
import musementpark.online.Bridge.Status;

import java.util.HashMap;

public abstract class Visitor {
    private static HashMap<String,Visitor> _prototypes=new HashMap<>();
    public static Visitor findAndClone(String className)
    {
        if(_prototypes.get(className.toLowerCase())!=null) {
            System.out.println("已经返回原型的克隆" + _prototypes.get(className.toLowerCase()).getClass().getSimpleName());
            return _prototypes.get(className.toLowerCase()).clone();
        }
        else
            return null;
    }
    protected static void addPrototype(Visitor visitor)
    {
        System.out.println("已经在Prototype-Visitor中自动添加"+visitor.getClass().getSimpleName());
        _prototypes.put(visitor.getClass().getSimpleName().toLowerCase(),visitor);
    }
    public abstract Visitor clone();


    private int _cost = 0;
    public void setCost(int cost){_cost=cost;}
    public int getCost(){return _cost;}
    protected Status _status = new Common();
    public void setStatus(Status status)
    {
        _status=status;
    }
    public abstract void getStatus();


    public abstract boolean isNull();
}

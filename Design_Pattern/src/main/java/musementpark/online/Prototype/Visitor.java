package musementpark.online.Prototype;

import musementpark.online.Bridge.Common;
import musementpark.online.Bridge.Status;

import java.util.HashMap;
/**
 * author: DannyXSC
 * description: 该类为Visitor抽象类，是具体类型游客的类的父类。对于游客的生成我们采用了原型模式，将每一种类型的游客都登记在父类中
 * 在该类有一个hash表的结构，其中注册了所有子类的一个对象，当需要生成某个子类的实例时直接通过该类的方法即可生成
 */
public abstract class Visitor {
    private static HashMap<String,Visitor> _prototypes=new HashMap<>();

    /**
     * description: 通过传进来的类名在hash表中找到该对象，并调用对应子类的clone方法生成新的子类对象
     * @param className 需要生成子类对象的类名
     * @return 返回一个子类对象的引用
     */
    public static Visitor findAndClone(String className)
    {
        if(_prototypes.get(className.toLowerCase())!=null) {
            System.out.println("已经返回原型的克隆" + _prototypes.get(className.toLowerCase()).getClass().getSimpleName());
            return _prototypes.get(className.toLowerCase()).clone();
        }
        else
            return null;
    }

    /**
     * description: 该方法是该类的静态方法，在每一个子类的私有构造函数中调用，使得每个子类在加载的时候就将自己注册到父类的哈希表中
     * @param visitor 一个父类型的引用
     */
    protected static void addPrototype(Visitor visitor)
    {
        System.out.println("已经在Prototype-Visitor中自动添加"+visitor.getClass().getSimpleName());
        _prototypes.put(visitor.getClass().getSimpleName().toLowerCase(),visitor);
    }

    /**
     * description: 该方法是一个抽象方法，供子类重写，返回子类的对象
     * @return 返回一个父类型的引用
     */
    public abstract Visitor clone();


    private int _cost = 0;

    /**
     * description: 设置价钱
     * @param cost 传入的价钱
     */
    public void setCost(int cost){_cost=cost;}
    /**
     * description: 外界调用，获取cost的值
     */
    public int getCost(){return _cost;}
    protected Status _status = new Common();

    /**
     * description: 为每个visitor设置身份，初始默认身份都是Common
     * @param status 身份
     */
    public void setStatus(Status status)
    {
        _status=status;
    }

    /**
     * description: 供外界调用，获取游客的身份
     */
    public abstract void getStatus();


    /**
     * description: 判断是否为空类型的游客，供子类重写
     * @return boolean
     */
    public abstract boolean isNull();
}

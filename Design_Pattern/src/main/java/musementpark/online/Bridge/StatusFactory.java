package musementpark.online.Bridge;

import musementpark.online.Prototype.Visitor;

/**
 * author: DannyXSC
 * description:该类是一个关于身份的工厂类，在设计模式方面应用了单例模式，作用是返回不同的身份类
 */
public class StatusFactory {
    private static StatusFactory _singleton = new StatusFactory();

    /**
     * description:私有构造函数，为了实现单例模式
     */
    private StatusFactory(){}

    /**
     * description: 该函数供外界获取该类的唯一实例singleton
     * @return 返回StatusFactory的唯一实例
     */
    public static StatusFactory getInstance()
    {return _singleton;}

    /**
     * description: 该函数的作用是根据传来的参数为visitor设置等级 由于visitor有三种类型，身份也有三种类型，因此此处采用桥接模式来完成对游客身份的设置
     * @param visitor 要添加身份的人
     * @param type 身份类型
     * @return 返回boolean值，1表示设置身份成功，0表示设置身份失败
     */
    public boolean addStatus(Visitor visitor,String type)
    {
        if(type.equalsIgnoreCase("VIP1")&&visitor.getCost()>=VIP1.minConsumption)
        {
            visitor.setStatus(new VIP1());
            System.out.println("为"+visitor.getClass().getSimpleName()+"设置地位"+type+"成功");
        }
        else if(type.equalsIgnoreCase("VIP2")&&visitor.getCost()>=VIP2.minConsumption)
        {
            visitor.setStatus(new VIP2());
            System.out.println("为"+visitor.getClass().getSimpleName()+"设置地位"+type+"成功");
        }
        else if(type.equalsIgnoreCase("COMMON")&&visitor.getCost()>=Common.minConsumption)
        {
            visitor.setStatus(new Common());
            System.out.println("为"+visitor.getClass().getSimpleName()+"设置地位"+type+"成功");
        }
        else
        {
            System.out.println("为"+visitor.getClass().getSimpleName()+"设置地位"+type+"失败");
            return false;
        }
        return true;
    }
}

package musementpark.online.Bridge;

import musementpark.online.Prototype.Visitor;

public class StatusFactory {
    private static StatusFactory _singleton = new StatusFactory();
    private StatusFactory(){}
    public static StatusFactory getInstance()
    {return _singleton;}

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

package musementpark.online.Bridge;

import musementpark.online.Prototype.Visitor;

public class StatusFactory {
    private StatusFactory _singleton = new StatusFactory();
    private StatusFactory(){}
    public StatusFactory getInstance()
    {return _singleton;}

    public boolean addStatus(Visitor visitor,String type)
    {
        switch (type.toUpperCase())
        {
            case "VIP1":
                if(visitor.cost<VIP1.minConsumption)
                    return false;
                visitor.setStatus(new VIP1());
                break;

            case "VIP2":
                if(visitor.cost<VIP2.minConsumption)
                    return false;
                visitor.setStatus(new VIP2());
                break;

            case "COMMON":
                if(visitor.cost<Common.minConsumption)
                    return false;
                visitor.setStatus(new Common());
                break;

            default:
                return false;
        }
        return true;
    }
}

package musementpark.online.Prototype_Bridge.Visitor;

import musementpark.online.Prototype_Bridge.PlayRestrict.PlayRestrict;

import java.util.HashMap;

public abstract class Visitor {
    private static HashMap<String,Visitor> _prototypes=new HashMap<>();
    public static Visitor findAndClone(String className)
    {
        System.out.println("已经返回原型的克隆"+_prototypes.get(className.toLowerCase()).getClass().getSimpleName());
        if(_prototypes.get(className.toLowerCase())!=null)
            return _prototypes.get(className.toLowerCase()).clone();
        else
            return null;
    }
    protected static void addPrototype(Visitor visitor)
    {
        System.out.println("已经在Prototype-Visitor中自动添加"+visitor.getClass().getSimpleName());
        _prototypes.put(visitor.getClass().getSimpleName().toLowerCase(),visitor);
    }
    public abstract Visitor clone();

    protected PlayRestrict _restrict;
    public void setPlayRestrict(PlayRestrict restrict)
    {
        _restrict=restrict;
    }
    public abstract void playWhirligig();
    public abstract void playKarting();

}

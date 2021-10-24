package musementpark.online.AbstractFactory;

import musementpark.online.Bridge.AdultPlayRestrict;
import musementpark.online.Bridge.ChildPlayRestrict;
import musementpark.online.Prototype.Adult;
import musementpark.online.Prototype.Child;
import musementpark.online.Prototype.Visitor;


public class ChildFactory implements AbstractFactory{
    private static final ChildFactory _singleton = new ChildFactory();

    private ChildFactory(){
        System.out.println("已创建单例ChildFactory");
    };

    public static ChildFactory getInstance(){
        return _singleton;
    }

    @Override
    public Visitor getVisitor() {
        System.out.println("调用抽象工厂AbstractFactory派生的简单工厂ChildFactory的工厂方法getVisitor");
        return Visitor.findAndClone("child");
    }

    @Override
    public void setPlayRestrict(Visitor visitor) {
        visitor.setPlayRestrict(new ChildPlayRestrict());
    }
}

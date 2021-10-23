package musementpark.online.SingleFactory_AbstractFactory_FactoryMethod_Singleton;

import musementpark.online.Prototype_Bridge.PlayRestrict.ChildPlayRestrict;
import musementpark.online.Prototype_Bridge.Visitor.Visitor;

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

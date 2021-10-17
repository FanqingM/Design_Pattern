package Online.SingleFactory_AbstractFactory_FactoryMethod_Singleton;

import Online.Prototype_Bridge.PlayRestrict.AdultPlayRestrict;
import Online.Prototype_Bridge.Visitor.Adult;
import Online.Prototype_Bridge.Visitor.Child;
import Online.Prototype_Bridge.Visitor.Visitor;

public class AdultFactory implements AbstractFactory{
    private static final AdultFactory _singleton = new AdultFactory();

    private AdultFactory(){
        System.out.println("已创建单例AdultFactory");
    };

    public static AdultFactory getInstance(){
        return _singleton;
    }

    @Override
    public Visitor getVisitor() {
        System.out.println("调用抽象工厂AbstractFactory派生的简单工厂AdultFactory的工厂方法getVisitor");
        return Visitor.findAndClone("adult");
    }

    @Override
    public void setPlayRestrict(Visitor visitor) {
        if(visitor instanceof Adult)
        {
            visitor.setPlayRestrict(new AdultPlayRestrict());
        }
        else if(visitor instanceof Child)
        {
            //do nothing
        }
        //do nothing
    }

}

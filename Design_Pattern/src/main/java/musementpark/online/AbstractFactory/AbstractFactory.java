package musementpark.online.SingleFactory_AbstractFactory_FactoryMethod_Singleton;

import musementpark.online.Prototype_Bridge.Visitor.Visitor;

public interface AbstractFactory {
    public Visitor getVisitor();
    public void setPlayRestrict(Visitor visitor);
}

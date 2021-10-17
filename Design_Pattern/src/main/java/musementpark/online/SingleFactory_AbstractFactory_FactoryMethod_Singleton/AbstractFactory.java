package Online.SingleFactory_AbstractFactory_FactoryMethod_Singleton;

import Online.Prototype_Bridge.Visitor.Visitor;

public interface AbstractFactory {
    public Visitor getVisitor();
    public void setPlayRestrict(Visitor visitor);
}

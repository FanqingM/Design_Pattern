package musementpark.online.AbstractFactory;

import musementpark.online.Prototype.Visitor;


public interface AbstractFactory {
    public Visitor getVisitor();
    public void setPlayRestrict(Visitor visitor);
}

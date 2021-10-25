package musementpark.online.NullObject;

import musementpark.online.Prototype.Visitor;

public class NullVisitor extends Visitor {
    private static final NullVisitor _nullVisitor = new NullVisitor();

    private NullVisitor() {
        addPrototype(this);
    }

    private NullVisitor(int dump){}

    @Override
    public NullVisitor clone() {
        return new NullVisitor(1);
    }

    @Override
    public void getStatus() {
        System.out.println("NullVisitor可以调用getStatus但是没有任何作用");
    }

    @Override
    public boolean isNull() {
        System.out.println("NullVisitor是null");
        return true;
    }
}

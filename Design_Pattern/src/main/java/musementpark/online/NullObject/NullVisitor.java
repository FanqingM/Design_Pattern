package musementpark.online.NullObject;

import musementpark.online.Prototype.Adult;
import musementpark.online.Prototype.Visitor;

public class NullVisitor extends Visitor {
    private static final NullVisitor _nullVisitor = new NullVisitor();

    private NullVisitor() {
        addPrototype(this);
    }

    private NullVisitor(int dump){}

    @Override
    public Visitor clone() {
        return new NullVisitor(1);
    }

    @Override
    public boolean isNull() {
        return true;
    }
}

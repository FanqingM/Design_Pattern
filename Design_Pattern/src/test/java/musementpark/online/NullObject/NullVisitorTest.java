package musementpark.online.NullObject;

import musementpark.online.Prototype.Visitor;
import musementpark.online.Prototype.VisitorFactory;
import musementpark.util.Load;

import static org.junit.jupiter.api.Assertions.*;

class NullVisitorTest {
    public static void main(String[] args)  {
        Load.loadVisitor();

        VisitorFactory factory = VisitorFactory.getInstance();
        Visitor visitor = factory.getVisitor("none");
        visitor.isNull();
        visitor.getStatus();

    }
}
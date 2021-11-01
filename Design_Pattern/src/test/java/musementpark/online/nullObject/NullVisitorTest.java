package musementpark.online.nullObject;

import musementpark.online.prototype.Visitor;
import musementpark.online.prototype.VisitorFactory;
import musementpark.util.Load;
import org.junit.jupiter.api.Test;

class NullVisitorTest {
    @Test
    public void NullVisitorTest() {
        Load.loadVisitor();

        VisitorFactory factory = VisitorFactory.getInstance();
        Visitor visitor = factory.getVisitor("none");
        visitor.isNull();
        visitor.getStatus();

    }
}
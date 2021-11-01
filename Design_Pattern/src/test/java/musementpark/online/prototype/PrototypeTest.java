package musementpark.online.prototype;

import musementpark.util.Load;
import org.junit.jupiter.api.Test;

class PrototypeTest {
    @Test
    public void PrototypeTest() {
        Load.loadVisitor();

        VisitorFactory factory = VisitorFactory.getInstance();
        Visitor v1 = factory.getVisitor("adult");
        Visitor v2 = factory.getVisitor("child");
        Visitor v3 = factory.getVisitor("none");

    }
}
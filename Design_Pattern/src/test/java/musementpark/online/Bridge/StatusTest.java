package musementpark.online.Bridge;

import musementpark.online.Prototype.Visitor;
import musementpark.online.Prototype.VisitorFactory;
import musementpark.util.Load;

import static org.junit.jupiter.api.Assertions.*;

class StatusTest {
    public static void main(String[] args) {
        Load.loadVisitor();


        Visitor v1 = VisitorFactory.getInstance().getVisitor("Adult");
        Visitor v2 = VisitorFactory.getInstance().getVisitor("Adult");
        Visitor v3 = VisitorFactory.getInstance().getVisitor("child");
        v1.setCost(150);
        v2.setCost(150);
        v3.setCost(150);
        StatusFactory factory = StatusFactory.getInstance();
        factory.addStatus(v1,"VIP1");
        factory.addStatus(v2,"VIP2");
        factory.addStatus(v3,"Common");

        v1.getStatus();
        v2.getStatus();
        v3.getStatus();
    }
}
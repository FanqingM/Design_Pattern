package musementpark.online.Adapter;

import musementpark.online.Prototype.Visitor;
import musementpark.online.Prototype.VisitorFactory;
import musementpark.util.Load;

import static org.junit.jupiter.api.Assertions.*;

class AmusementQueueTest {
    public static void main(String[] args) {
        Load.loadVisitor();


        VisitorFactory visitorFactory=VisitorFactory.getInstance();
        Visitor v1=visitorFactory.getVisitor("child");
        Visitor v2=visitorFactory.getVisitor("child");
        Visitor v3=visitorFactory.getVisitor("Adult");
        Visitor v4=visitorFactory.getVisitor("Adult");
        Visitor v5=visitorFactory.getVisitor("Adult");

        AmusementQueue queue= new AmusementQueue();
        queue.isEmpty();
        queue.add(v1);
        queue.add(v2);
        queue.add(v3);
        queue.add(v4);
        queue.add(v5);
        queue.get(5);
    }
}
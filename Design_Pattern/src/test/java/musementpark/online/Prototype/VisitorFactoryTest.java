package musementpark.online.Prototype;

import musementpark.util.Load;

import static org.junit.jupiter.api.Assertions.*;

class VisitorFactoryTest {
    public static void main(String[] args) {
        Load.loadVisitor();

        VisitorFactory factory = VisitorFactory.getInstance();
        Visitor v1 = factory.getVisitor("adult");
        Visitor v2 = factory.getVisitor("child");
        Visitor v3 = factory.getVisitor("none");

    }
}
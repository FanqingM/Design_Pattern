package musementpark.online.Facade1;

import musementpark.online.Prototype.VisitorFactory;
import musementpark.util.Load;

import static org.junit.jupiter.api.Assertions.*;

class AmusementDeviceTest {
    public static void main(String[] args) {
        Load.loadVisitor();

        AmusementDevice device = Whirligig.getInstance();
        device.queueUp(VisitorFactory.getInstance().getVisitor("Adult"));
        device.queueUp(VisitorFactory.getInstance().getVisitor("Adult"));
        device.queueUp(VisitorFactory.getInstance().getVisitor("child"));
        device.run();
    }
}
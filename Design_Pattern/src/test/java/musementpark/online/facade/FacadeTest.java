package musementpark.online.facade;

import musementpark.online.prototype.VisitorFactory;
import musementpark.util.Load;
import org.junit.jupiter.api.Test;

class FacadeTest {
    @Test
    public void FacadeTest() {
        Load.loadVisitor();

        AmusementDevice device = Whirligig.getInstance();
        device.queueUp(VisitorFactory.getInstance().getVisitor("Adult"));
        device.queueUp(VisitorFactory.getInstance().getVisitor("Adult"));
        device.queueUp(VisitorFactory.getInstance().getVisitor("child"));
        device.run();
    }
}
package musementpark.offline.entertainment.decorator;

import musementpark.offline.entertainment.Construct;
import musementpark.offline.entertainment.composite.Component;
import musementpark.offline.entertainment.composite.Composite;
import musementpark.offline.entertainment.composite.Leaf;
import org.junit.jupiter.api.Test;

class DecoratorTest {
    @Test
    public void DecoratorTest() {
        Construct construct = new Construct();
        Component lf1 = construct.ConstructEntertainment();
        EntertainmentDecorator facility1 = new FenceDecorator(lf1);
        EntertainmentDecorator facility2 = new FenceDecorator(facility1);
        EntertainmentDecorator facility3 = new TimeDecorator(facility2);
    }

}
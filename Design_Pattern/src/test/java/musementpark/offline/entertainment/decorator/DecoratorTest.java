package musementpark.offline.entertainment.decorator;

import musementpark.offline.base.composite.Component;
import musementpark.offline.base.composite.Composite;
import musementpark.offline.base.composite.Leaf;
import org.junit.jupiter.api.Test;

class DecoratorTest {
    @Test
    public void DecoratorTest3() {
        //创建一个树状结构
        Component root = new Composite("娱乐区");

        Component c1 = new Composite("高空");
        Component c2 = new Composite("陆地");
        root.addChild(c1);
        root.addChild(c2);

        Component lf1 = new Leaf("摩天轮");
        Component lf2 = new Leaf("过山车");
        c1.addChild(lf1);
        c1.addChild(lf2);

        Component lf3 = new Leaf("旋转木马");
        Component lf4 = new Leaf("鬼屋");
        c2.addChild(lf3);
        c2.addChild(lf4);
        EntertainmentDecorator facility1 = new FenceDecorator(lf1);
        EntertainmentDecorator facility2 = new FenceDecorator(facility1);
        EntertainmentDecorator facility3 = new TimeDecorator(facility2);
    }

}
package musementpark.offline.entertainment.composite;

import org.junit.jupiter.api.Test;

class CompositeTest {
    @Test
    //对于客户端而言，操作的都是组件对象。
    public void compositeTest() {
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
        c2.removeChild(lf3);
        c2.addChild(lf3);
        c2.addChild(lf4);
    }
}
package musementpark.offline.base.visitor;

import musementpark.offline.base.composite.Component;
import musementpark.offline.base.composite.Composite;
import musementpark.offline.base.composite.Leaf;

class VisitorTest {
    public static void main(String[] args) {
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

        //动态添加功能
        ObjectStructure os = new ObjectStructure();
        os.setRoot(root);
        os.handleRequest(new CheckTemperatureVisitor());
        System.out.println("++++++++++++++++++++++++");
        os.setRoot(c2);
        os.handleRequest(new CheckElectricVisitor());


    }
}
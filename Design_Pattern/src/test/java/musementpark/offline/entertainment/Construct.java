package musementpark.offline.entertainment;

import musementpark.offline.entertainment.composite.Component;
import musementpark.offline.entertainment.composite.Composite;
import musementpark.offline.entertainment.composite.Leaf;
import musementpark.offline.entertainment.iterator.EntertainmentList;

public class Construct {


    public Component ConstructEntertainment () {
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
        return lf1;
    }

    public void ConstructEntertainments () {
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
    }


    public EntertainmentList ConstructEntertainmentList() {
        EntertainmentList entertainmentList = new EntertainmentList();
        //定义所有的组合对象
        Component root = new Composite("娱乐区");
        Component c1 = new Composite("高空");
        entertainmentList.components[entertainmentList.length++] = c1;
        Component c2 = new Composite("陆地");
        entertainmentList.components[entertainmentList.length++] = c2;

        //定义所有的叶子对象
        Component leaf1 = new Leaf("摩天轮");
        entertainmentList.components[entertainmentList.length++] = leaf1;
        Component leaf2 = new Leaf("过山车");
        entertainmentList.components[entertainmentList.length++] = leaf2;
        Component leaf3 = new Leaf("旋转木马");
        entertainmentList.components[entertainmentList.length++] = leaf3;
        Component leaf4 = new Leaf("鬼屋");
        entertainmentList.components[entertainmentList.length++] = leaf4;

        //按照树的结构来组合组合对象和叶子对象
        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);
        //以上构造需要迭代器便利的数据结构
        return entertainmentList;
    }
}

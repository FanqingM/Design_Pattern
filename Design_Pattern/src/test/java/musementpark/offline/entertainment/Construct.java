//package musementpark.offline.entertainment;
//
//import musementpark.offline.entertainment.composite.Component;
//import musementpark.offline.entertainment.composite.Composite;
//import musementpark.offline.entertainment.composite.Leaf;
//
//public class Construct {
//    public Component ConstrucEntermainment () {
//        //定义所有的组合对象
//        Component root = new Composite("游乐设施");
//        Component c1 = new Composite("高空类游乐设施");
//        Component c2 = new Composite("陆地类游乐设施");
//        Component c3 = new Composite("水面类游乐设施");
//
//        //定义所有的叶子对象
//        Component leaf1 = new Leaf("摩天轮");
//        Component leaf2 = new Leaf("过山车");
//        Component leaf3 = new Leaf("旋转木马");
//        Component leaf4 = new Leaf("鬼屋");
//        Component leaf5 = new Leaf("水上乐园");
//        Component leaf6 = new Leaf("水球");
//
//        //按照树的结构来组合组合对象和叶子对象
//        root.addChild(c1);
//        root.addChild(c2);
//        root.addChild(c3);
//        c1.addChild(leaf1);
//        c1.addChild(leaf2);
//        c2.addChild(leaf3);
//        c2.addChild(leaf4);
//        c3.addChild(leaf5);
//        c3.addChild(leaf6);
//        //调用根对象的输出功能来输出整棵树
//        return root;
//    }
//}

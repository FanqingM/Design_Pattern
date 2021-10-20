//package musementpark.offline.entertainment.command.decorator;
//
//import musementpark.offline.base.security.composite.Component;
//import musementpark.offline.base.security.composite.Composite;
//import musementpark.offline.base.security.composite.Leaf;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CommandDecoratorTest {
//    public static void main(String[] args) {
//        Component root = new Composite("娱乐区");
//
//        Component c1 = new Composite("高空");
//        Component c2 = new Composite("陆地");
//        root.addChild(c1);
//        root.addChild(c2);
//
//        Component lf1 = new Leaf("摩天轮");
//        Component lf2 = new Leaf("过山车");
//        c1.addChild(lf1);
//        c1.addChild(lf2);
//
//        Component lf3 = new Leaf("旋转木马");
//        Component lf4 = new Leaf("鬼屋");
//        c2.addChild(lf3);
//        c2.addChild(lf4);
//        CommandDecorator commandDecorator = new CommandDecorator(lf1);
//        System.out.println(commandDecorator.component.name);
//        commandDecorator.volumeUp();
//    }
//}
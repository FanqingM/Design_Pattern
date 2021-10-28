package musementpark.offline.entertainment.memento;

import musementpark.offline.base.security.composite.Component;
import musementpark.offline.base.security.composite.Composite;
import musementpark.offline.base.security.composite.Leaf;
import musementpark.offline.entertainment.command.Entertainment;
import musementpark.offline.entertainment.command.*;

import static org.junit.jupiter.api.Assertions.*;

class MementoTest {
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
        Entertainment entertain = new Entertainment(lf1);
        System.out.println(entertain.component.name);
        MementoStack mementoStack = new MementoStack();
        Memento memento = new Memento();
        Macro myMacro = new Macro();

        myMacro.addCommand(new OpenCommand(entertain));
        myMacro.addCommand(new VolumeCommand(entertain));
        myMacro.addCommand(new LightCommand(entertain));
        EntertainmentCommand cc = new CloseCommand(entertain);
        myMacro.execute();
        //这里应该用宏命令创建备忘录
        Memento m = entertain.createMemento();
        System.out.println(m.volume);
        System.out.println(m.light);
        System.out.println(m.isOpen);
        System.out.println(m.getState().volume);
        System.out.println(m.getState().light);
        System.out.println(m.getState().isOpen);
        mementoStack.add(m);

        System.out.println("存档状态");
        System.out.println("开关的状态: " + entertain.isOpen);
        System.out.println("灯的状态: " + entertain.light);
        System.out.println("音量的状态: " + entertain.volume);
        System.out.println("------------------------------");
        myMacro.addCommand(cc);
        myMacro.execute();
        System.out.println("当前状态");
        System.out.println("开关的状态: " + entertain.isOpen);
        System.out.println("灯的状态: " + entertain.light);
        System.out.println("音量的状态: " + entertain.volume);
        System.out.println("------------------------------");

        Memento mem = mementoStack.get();
        entertain = mem.getState();
        System.out.println("撤销操作后状态");
        System.out.println("开关的状态: " + entertain.isOpen);
        System.out.println("灯的状态: " + entertain.light);
        System.out.println("音量的状态: " + entertain.volume);
    }
}
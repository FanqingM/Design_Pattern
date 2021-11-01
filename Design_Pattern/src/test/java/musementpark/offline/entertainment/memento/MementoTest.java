package musementpark.offline.entertainment.memento;

import musementpark.offline.entertainment.Construct;
import musementpark.offline.entertainment.composite.Component;
import musementpark.offline.entertainment.composite.Composite;
import musementpark.offline.entertainment.composite.Leaf;
import musementpark.offline.entertainment.command.Entertainment;
import musementpark.offline.entertainment.command.*;
import org.junit.jupiter.api.Test;

class MementoTest {
    @Test
    public void MementoTest() {
        Construct construct = new Construct();
        Component lf1 = construct.ConstructEntertainment();
        Entertainment entertain = new Entertainment(lf1);
//        System.out.println(entertain.component.name);
        MementoStack mementoStack = new MementoStack();
        Memento memento = new Memento();
        Macro myMacro = new Macro();

        myMacro.addCommand(new OpenCommand(entertain));
        myMacro.addCommand(new VolumeCommand(entertain));
        myMacro.addCommand(new LightCommand(entertain));
        EntertainmentCommand cc = new CloseCommand(entertain);
        myMacro.execute();
        Memento m = entertain.createMemento();
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
package musementpark.offline.entertainment.memento;

import musementpark.offline.entertainment.command.Entertainment;
import musementpark.offline.entertainment.command.*;

import static org.junit.jupiter.api.Assertions.*;

class MementoTest {
    public static void main(String[] args) {
        Entertainment entertain = new Entertainment();
        MementoStack mementoStack = new MementoStack();
        Memento memento = new Memento();
        Macro myMacro = new Macro();

        myMacro.addCommand(new OpenCommand(entertain));
        myMacro.addCommand(new VolumeCommand(entertain));
        myMacro.addCommand(new LightCommand(entertain));
        EntertainmentCommand cc = new CloseCommand(entertain);
        myMacro.execute();
        Memento m = entertain.createMemento();
        System.out.println(m.volume);
        System.out.println(m.light);
        System.out.println(m.isOpen);
        System.out.println(m.getState().volume);
        System.out.println(m.getState().light);
        System.out.println(m.getState().isOpen);
        mementoStack.add(m);
        Memento mem2 = mementoStack.get();
        System.out.println(mem2.volume);
        System.out.println(mem2.light);
        System.out.println(mem2.isOpen);
        System.out.println(mem2.getState().volume);
        System.out.println(mem2.getState().light);
        System.out.println(mem2.getState().isOpen);
//        System.out.println("存档状态");
//        System.out.println("开关的状态: " + entertain.isOpen);
//        System.out.println("灯的状态: " + entertain.light);
//        System.out.println("音量的状态: " + entertain.volume);
//        System.out.println("------------------------------");
//        myMacro.addCommand(cc);
//        myMacro.execute();
//        System.out.println("当前状态");
//        System.out.println("开关的状态: " + entertain.isOpen);
//        System.out.println("灯的状态: " + entertain.light);
//        System.out.println("音量的状态: " + entertain.volume);
//        System.out.println("------------------------------");
//        Memento mem = mementoStack.get();
//        System.out.println("开关的状态: " + mem.isOpen);
//        System.out.println("灯的状态: " + mem.light);
//        System.out.println("音量的状态: " + mem.volume);
//        entertain = mem.getState();
//        System.out.println("撤销操作后状态");
//        System.out.println("开关的状态: " + mem.getState().isOpen);
//        System.out.println("灯的状态: " + mem.getState().light);
//        System.out.println("音量的状态: " + mem.getState().volume);
    }
}
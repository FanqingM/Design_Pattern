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
        System.out.println("开关的状态: " + mem.getState().isOpen);
        System.out.println("灯的状态: " + mem.getState().light);
        System.out.println("音量的状态: " + mem.getState().volume);
    }
}
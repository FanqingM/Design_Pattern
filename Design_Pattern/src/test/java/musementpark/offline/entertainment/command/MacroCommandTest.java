package musementpark.offline.entertainment.command;

import musementpark.offline.base.security.composite.Component;
import musementpark.offline.base.security.composite.Composite;
import musementpark.offline.base.security.composite.Leaf;

class MacroCommandTest {
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
        Macro myMacro = new Macro();
        myMacro.addCommand(new OpenCommand(entertain));
        myMacro.addCommand(new VolumeCommand(entertain));
        myMacro.addCommand(new LightCommand(entertain));
        EntertainmentCommand cc = new CloseCommand(entertain);
        myMacro.addCommand(cc);
        myMacro.execute();

        System.out.println("------------------------------");
        myMacro.removeCommand(cc);
        myMacro.execute();

    }


}
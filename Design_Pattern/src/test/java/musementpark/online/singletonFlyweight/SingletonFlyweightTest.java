package musementpark.online.singletonFlyweight;

import musementpark.offline.entertainment.composite.Component;
import musementpark.offline.entertainment.composite.Composite;
import musementpark.offline.entertainment.composite.Leaf;
import musementpark.online.decorator.AuthorityDecorator;
import musementpark.online.decorator.EntertainmentDecorator;
import musementpark.online.decorator.WaitingTimeDecorator;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Hashtable;

/**
 * author: Yxxxb
 * description: 单例享元模式测试类
 */
public class SingletonFlyweightTest {
    @Test
    public void SingletonFlyweightTest() throws IOException{
        System.out.println("单例享元模式测试");
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
        EntertainmentDecorator e11 = new EntertainmentDecorator(lf1);
        EntertainmentDecorator e12 = new AuthorityDecorator(e11);
        EntertainmentDecorator e1 = new WaitingTimeDecorator(e12);
        EntertainmentDecorator e21 = new EntertainmentDecorator(lf2);
        EntertainmentDecorator e22 = new AuthorityDecorator(e21);
        EntertainmentDecorator e2 = new WaitingTimeDecorator(e22);
        EntertainmentDecorator e31 = new EntertainmentDecorator(lf3);
        EntertainmentDecorator e32 = new AuthorityDecorator(e31);
        EntertainmentDecorator e3 = new WaitingTimeDecorator(e32);
        EntertainmentDecorator e41 = new EntertainmentDecorator(lf4);
        EntertainmentDecorator e42 = new AuthorityDecorator(e41);
        EntertainmentDecorator e4 = new AuthorityDecorator(e42);
        String[] entertainmentNameList = new String[]{"摩天轮", "过山车", "旋转木马", "鬼屋"};


        EntertainmentDecorator[] EntertainmentList = new EntertainmentDecorator[]{e1, e2, e3, e4};

        Hashtable<String, Boolean> AuthorityTable = new Hashtable<String, Boolean>();
        AuthorityTable.put("vip", true);
        AuthorityTable.put("normal", false);
        AuthorityTable.put("daytime", true);
        AuthorityTable.put("nighttime", true);

        Administrator a1 = new Administrator(e1);
        Administrator a2 = new Administrator(e2);
        Administrator a3 = new Administrator(e3);
        Administrator a4 = new Administrator(e4);

        a1.set_EntertainmentAuthority(AuthorityTable);
        a2.set_EntertainmentAuthority(AuthorityTable);
        a3.set_EntertainmentAuthority(AuthorityTable);
        a4.set_EntertainmentAuthority(AuthorityTable);

        SingleTypeTourist singleTypeTourist = new SingleTypeTourist(entertainmentNameList, "vip", EntertainmentList);
        singleTypeTourist.show();
    }
}

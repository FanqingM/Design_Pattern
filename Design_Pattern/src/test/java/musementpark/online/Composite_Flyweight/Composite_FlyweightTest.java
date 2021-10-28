package musementpark.online.Composite_Flyweight;

import java.io.IOException;
import java.util.Hashtable;

/**
 * @author: Yxxxb
 * @date: 2021/10/28 14:09
 * @description:
 */
public class Composite_FlyweightTest {
    public static void main(String[] args) throws IOException {
        System.out.println("组合享元模式测试");

        // 依照不同娱乐设施名称建立Entertainment类
        String[] entertainmentNameList = new String[]{"旋转木马", "大摆锤", "过山车", "激流勇进"};
        Entertainment e1 = new Entertainment(entertainmentNameList[0]);
        Entertainment e2 = new Entertainment(entertainmentNameList[1]);
        Entertainment e3 = new Entertainment(entertainmentNameList[2]);
        Entertainment e4 = new Entertainment(entertainmentNameList[3]);

        Entertainment[] EntertainmentList = new Entertainment[]{e1, e2, e3, e4};

        // 设置多种权限表
        Hashtable<String, Boolean> AuthorityTable1 = new Hashtable<String, Boolean>();
        AuthorityTable1.put("vip", true);
        AuthorityTable1.put("normal", false);
        AuthorityTable1.put("daytime", true);
        AuthorityTable1.put("nighttime", true);
        Hashtable<String, Boolean> AuthorityTable2 = new Hashtable<String, Boolean>();
        AuthorityTable2.put("vip", true);
        AuthorityTable2.put("normal", true);
        AuthorityTable2.put("daytime", true);
        AuthorityTable2.put("nighttime", false);

        Administrator a1 = new Administrator(e1);
        Administrator a2 = new Administrator(e2);
        Administrator a3 = new Administrator(e3);
        Administrator a4 = new Administrator(e4);

        a1.set_EntertainmentAuthority(AuthorityTable1);
        a2.set_EntertainmentAuthority(AuthorityTable2);
        a3.set_EntertainmentAuthority(AuthorityTable1);
        a4.set_EntertainmentAuthority(AuthorityTable2);

        String[][] a = new String[][]{entertainmentNameList, entertainmentNameList, entertainmentNameList, entertainmentNameList};
        String[] TouristType = new String[]{"vip", "normal", "daytime", "nighttime"};
        CompositeTypesTourist compositeTypesTourist = new CompositeTypesTourist(a, TouristType, EntertainmentList);
    }
}

package musementpark.online.Singleton_Flyweight;

import java.io.IOException;
import java.util.Hashtable;

/**
 * author: Yxxxb
 * description: 单例享元模式测试类
 */
public class Singleton_FlyweightTest {
    public static void main(String[] args) throws IOException {
        System.out.println("单例享元模式测试");

        String[] entertainmentNameList = new String[]{"旋转木马", "大摆锤", "过山车", "激流勇进", "旋转木马", "大摆锤", "过山车", "旋转木马"};
        Entertainment e1 = new Entertainment(entertainmentNameList[0]);
        Entertainment e2 = new Entertainment(entertainmentNameList[1]);
        Entertainment e3 = new Entertainment(entertainmentNameList[2]);
        Entertainment e4 = new Entertainment(entertainmentNameList[3]);
        Entertainment e5 = new Entertainment(entertainmentNameList[4]);
        Entertainment e6 = new Entertainment(entertainmentNameList[5]);
        Entertainment e7 = new Entertainment(entertainmentNameList[6]);
        Entertainment e8 = new Entertainment(entertainmentNameList[7]);

        Entertainment[] EntertainmentList = new Entertainment[]{e1, e2, e3, e4, e5, e6, e7, e8};

        Hashtable<String, Boolean> AuthorityTable = new Hashtable<String, Boolean>();
        AuthorityTable.put("vip", true);
        AuthorityTable.put("normal", false);
        AuthorityTable.put("daytime", true);
        AuthorityTable.put("nighttime", true);

        Administrator a1 = new Administrator(e1);
        Administrator a2 = new Administrator(e2);
        Administrator a3 = new Administrator(e3);
        Administrator a4 = new Administrator(e4);
        Administrator a5 = new Administrator(e5);
        Administrator a6 = new Administrator(e6);
        Administrator a7 = new Administrator(e7);
        Administrator a8 = new Administrator(e8);

        a1.set_EntertainmentAuthority(AuthorityTable);
        a2.set_EntertainmentAuthority(AuthorityTable);
        a3.set_EntertainmentAuthority(AuthorityTable);
        a4.set_EntertainmentAuthority(AuthorityTable);
        a5.set_EntertainmentAuthority(AuthorityTable);
        a6.set_EntertainmentAuthority(AuthorityTable);
        a7.set_EntertainmentAuthority(AuthorityTable);
        a8.set_EntertainmentAuthority(AuthorityTable);

        SingleTypeTourist singleTypeTourist = new SingleTypeTourist(entertainmentNameList, "vip", EntertainmentList);
        singleTypeTourist.show();
    }
}

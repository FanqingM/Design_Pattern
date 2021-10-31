package musementpark.online.Observer;

import java.util.Hashtable;

/**
 * author: Yxxxb
 * description: 观察者模式测试类
 */
public class ObserverTest {
    public static void main(String[] args) {
        System.out.println("观察者模式测试\n");

        Entertainment entertainment = new Entertainment("旋转木马");

        Hashtable<String, Boolean> AuthorityTable = new Hashtable<String, Boolean>();
        AuthorityTable.put("vip", true);
        AuthorityTable.put("normal", false);
        AuthorityTable.put("daytime", true);
        AuthorityTable.put("nighttime", true);

        OnlineEntertainment onlineEntertainment1 = new OnlineEntertainment("旋转木马", "vip", entertainment);
        OnlineEntertainment onlineEntertainment2 = new OnlineEntertainment("旋转木马", "normal", entertainment);
        OnlineEntertainment onlineEntertainment3 = new OnlineEntertainment("旋转木马", "daytime", entertainment);
        OnlineEntertainment onlineEntertainment4 = new OnlineEntertainment("旋转木马", "nighttime", entertainment);

        Administrator administrator = new Administrator(entertainment);

        administrator.set_EntertainmentAuthority(AuthorityTable);
    }
}

package musementpark.online.Composite_Flyweight;

import java.io.IOException;

/**
 * @author: Yxxxb
 * @date: 2021/10/28 13:51
 * @description:
 */
public class SingleTypeTourist {
    private final OnlineEntertainment[] Entertainments;

    public SingleTypeTourist(String[] OnlineEntertainmentList, String TouristType, Entertainment[] EntertainmentList) throws IOException {
        Entertainments = new OnlineEntertainment[OnlineEntertainmentList.length];
        ManageFactory factory = ManageFactory.getInstance();
        for (int i = 0; i < Entertainments.length; i++) {
            // 这里修改为命令模式  也可以加上visitor
            Entertainments[i] = factory.getEntertainmentTourist(OnlineEntertainmentList[i], TouristType, EntertainmentList[i]);
        }
    }

    public void show() {
        for (OnlineEntertainment entertainment : Entertainments) {
            entertainment.show();
        }
    }
}

package Management;

import java.io.IOException;

/**
 * @author: Yxxxb
 * @date: 2021/10/16 12:23
 * @description: 单例享元
 */
public class SingleTypeTourist {
    private final Entertainment[] Entertainments;

    public SingleTypeTourist(String[] EntertainmentList, String TouristType, int WaitingTime) throws IOException {
        Entertainments = new Entertainment[EntertainmentList.length];
        ManageFactory factory = ManageFactory.getInstance();
        for (int i = 0; i < Entertainments.length; i++) {
            // 这里修改为命令模式  也可以加上visitor
            factory.getEntertainmentManage(EntertainmentList[i], TouristType, WaitingTime);
            Entertainments[i] = factory.getEntertainmentTourist(EntertainmentList[i], TouristType);
        }
    }

    public void show() {
        for (Entertainment entertainment : Entertainments) {
            entertainment.show();
        }
    }
}

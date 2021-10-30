package musementpark.online.Composite_Flyweight;

import java.io.IOException;

/**
 * author: Yxxxb
 * description: 单例享元调用类 调用工厂类内的相关函数
 */
public class SingleTypeTourist {
    private final OnlineEntertainment[] Entertainments;

    /*
     * 构造函数
     * @param String[] OnlineEntertainmentList, String TouristType, Entertainment[] EntertainmentList
     * */
    public SingleTypeTourist(String[] OnlineEntertainmentList, String TouristType, Entertainment[] EntertainmentList) throws IOException {
        Entertainments = new OnlineEntertainment[OnlineEntertainmentList.length];
        ManageFactory factory = ManageFactory.getInstance();
        for (int i = 0; i < Entertainments.length; i++) {
            // 这里修改为命令模式  也可以加上visitor
            Entertainments[i] = factory.getEntertainmentTourist(OnlineEntertainmentList[i], TouristType, EntertainmentList[i]);
        }
    }

    /*
     * show函数 输出用
     * @param 无
     * */
    public void show() {
        for (OnlineEntertainment entertainment : Entertainments) {
            entertainment.show();
        }
    }
}

package Management;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Yxxxb
 * @date: 2021/10/16 12:24
 * @description: 组合享元
 */
public class CompositeTypesTourist {
    private Map<String, Entertainment[]> TypesEntertainments = new HashMap<>();
    private final Entertainment[] Entertainments;

    public CompositeTypesTourist(String[] EntertainmentList, String TouristType, int WaitingTime) throws IOException {
        Entertainments = new Entertainment[EntertainmentList.length];
        ManageFactory factory = ManageFactory.getInstance();
        for (int i = 0; i < Entertainments.length; i++) {
            // 这里修改为命令模式  也可以加上visitor
            factory.getEntertainmentManage(EntertainmentList[i], TouristType, WaitingTime);
            Entertainments[i] = factory.getEntertainmentTourist(EntertainmentList[i], TouristType);
        }
    }

    public void addType(String type, Entertainment[] entertainments) {
        TypesEntertainments.put(type, entertainments);
    }

    public void removeType(String type) {
        TypesEntertainments.remove(type);
    }

    public void show() {
        for (Entertainment entertainment : Entertainments) {
            entertainment.show();
        }
    }
}

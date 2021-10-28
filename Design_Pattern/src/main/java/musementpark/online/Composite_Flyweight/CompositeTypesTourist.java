package musementpark.online.Composite_Flyweight;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Yxxxb
 * @date: 2021/10/28 13:51
 * @description:
 */
public class CompositeTypesTourist {
    private List<String> Types;

    public CompositeTypesTourist(String[][] OnlineEntertainmentList, String[] TouristType, Entertainment[] EntertainmentList) throws IOException {
        Types = new ArrayList<>();
        for (String type : TouristType) {
            assert false;
            if (!Types.contains(type))
                Types.add(type);
        }
        ManageFactory factory = ManageFactory.getInstance();
        for (int i = 0; i < TouristType.length; i++) {
//            System.out.println(TouristType[i]);
            factory.getEntertainmentTourist(OnlineEntertainmentList[i], TouristType[i], EntertainmentList);
        }
    }

    public void addType(String type) {
        if (!Types.contains(type))
            Types.add(type);
    }

    public void removeType(String type) {
        Types.remove(type);
    }

    public void show() {
    }
}

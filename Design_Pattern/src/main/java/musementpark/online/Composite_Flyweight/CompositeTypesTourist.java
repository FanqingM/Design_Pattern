package musementpark.online.Composite_Flyweight;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * author: Yxxxb
 * description: 组合享元调用类 调用工厂类内的相关函数
 */
public class CompositeTypesTourist {
    private List<String> Types;

    /*
     * 组合享元实体类构造函数
     * @param 线上类组合对象数组，游客类型列表，娱乐设施实体类列表
     * */
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

    /*
     * 新增游客类型
     * @param 游客类型
     * */
    public void addType(String type) {
        if (!Types.contains(type))
            Types.add(type);
    }

    /*
     * 删改游客类型
     * @param 游客类型
     * */
    public void removeType(String type) {
        Types.remove(type);
    }

    /*
     * show函数
     * @param 无
     * */
    public void show() {
    }
}

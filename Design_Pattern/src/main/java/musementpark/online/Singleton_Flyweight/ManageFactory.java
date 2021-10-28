package musementpark.online.Singleton_Flyweight;

import java.io.IOException;
import java.util.Hashtable;

/**
 * @author: Yxxxb
 * @date: 2021/10/28 13:47
 * @description:
 */
public class ManageFactory {
    //TouristType HashTable
    private final Hashtable<String, Hashtable<String, OnlineEntertainment>> FactoryTypeTable = new Hashtable<>();

    private static final ManageFactory singleton = new ManageFactory();

    public static ManageFactory getInstance() {
        return singleton;
    }

    public synchronized OnlineEntertainment getEntertainmentTourist(String EntertainmentName, String TouristType, Entertainment entertainment) throws IOException {
        Hashtable<String, OnlineEntertainment> singleTypeTourist = FactoryTypeTable.get(TouristType);
        if (singleTypeTourist == null) {
            singleTypeTourist = new Hashtable<String, OnlineEntertainment>();
            FactoryTypeTable.put(TouristType, singleTypeTourist);
            System.out.println(TouristType + " 类型游客已被创建\n");
        }
        OnlineEntertainment EM = (OnlineEntertainment) singleTypeTourist.get(EntertainmentName);
        if (EM == null) {
            EM = new OnlineEntertainment(EntertainmentName, TouristType, entertainment);
            FactoryTypeTable.get(TouristType).put(EntertainmentName, EM);
            System.out.println(EntertainmentName + " 游乐设施线上类已被创建");
            System.out.println("内部状态： 娱乐设施 - " + EntertainmentName + " 游客类型 - " + TouristType + "\n外部状态： 等候时间 是否玩过 剩余游玩次数等...\n");
        } else {
            System.out.println(EntertainmentName + " 享元对象已存在");
            System.out.println("内部状态： 娱乐设施 - " + EntertainmentName + " 游客类型 - " + TouristType + "\n外部状态： 等候时间 是否玩过 剩余游玩次数等...\n");
        }
        return EM;
    }

    public synchronized void getEntertainmentTourist(String[] EntertainmentName, String TouristType, Entertainment[] entertainment) throws IOException {
        SingleTypeTourist singleTypeTourist = new SingleTypeTourist(EntertainmentName, TouristType, entertainment);
        System.out.println(TouristType);
        singleTypeTourist.show();
    }
}

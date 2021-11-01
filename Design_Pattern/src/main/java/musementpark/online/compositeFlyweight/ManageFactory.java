package musementpark.online.compositeFlyweight;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

import java.io.IOException;
import java.util.Hashtable;

/**
 * author: Yxxxb
 * description: 享元工厂类 建立享元对象 实现组合享元与单例享元的链接
 */
public class ManageFactory {
    //TouristType HashTable
    private final Hashtable<String, Hashtable<String, OnlineEntertainment>> FactoryTypeTable = new Hashtable<>();

    private static final ManageFactory singleton = new ManageFactory();

    /*
     * 单例享元工厂返回函数
     * @param 无
     * */
    public static ManageFactory getInstance() {
        return singleton;
    }

    /*
     * 享元对象构建函数
     * @param String EntertainmentName, String TouristType, Entertainment entertainment
     * */
    public synchronized OnlineEntertainment getEntertainmentTourist(String EntertainmentName, String TouristType, Entertainment entertainment) {
        Hashtable<String, OnlineEntertainment> singleTypeTourist = FactoryTypeTable.get(TouristType);
        if (singleTypeTourist == null) {
            singleTypeTourist = new Hashtable<String, OnlineEntertainment>();
            FactoryTypeTable.put(TouristType, singleTypeTourist);
            System.out.println("\n" + TouristType + " 类型游客已被创建\n");
        }
        OnlineEntertainment EM = (OnlineEntertainment) singleTypeTourist.get(EntertainmentName);
        if (EM == null) {
            EM = new OnlineEntertainment(EntertainmentName, TouristType, entertainment);
            FactoryTypeTable.get(TouristType).put(EntertainmentName, EM);
            String outputInfo = EntertainmentName + " 游乐设施线上类已被创建\n" + "内部状态： 娱乐设施 - " + EntertainmentName + " 游客类型 - " + TouristType + "\n外部状态： 等候时间 是否玩过 剩余游玩次数等...\n";
            Print.print(
                    new PrintInfo(
                            "ManageFactory",
                            String.valueOf(System.identityHashCode(this)),
                            "getEntertainmentTourist",
                            outputInfo
                    )
            );
        } else {
            String outputInfo = EntertainmentName + " 享元对象已存在\n" + "内部状态： 娱乐设施 - " + EntertainmentName + " 游客类型 - " + TouristType + "\n外部状态： 等候时间 是否玩过 剩余游玩次数等...\n";
            Print.print(
                    new PrintInfo(
                            "ManageFactory",
                            String.valueOf(System.identityHashCode(this)),
                            "getEntertainmentTourist",
                            outputInfo
                    )
            );
        }
        return EM;
    }

    /*
     * 组合享元对象构建函数
     * @param String[] EntertainmentName, String TouristType, Entertainment[] entertainment
     * */
    public synchronized void getEntertainmentTourist(String[] EntertainmentName, String TouristType, Entertainment[] entertainment) {
        SingleTypeTourist singleTypeTourist = new SingleTypeTourist(EntertainmentName, TouristType, entertainment);
        singleTypeTourist.show();
    }
}

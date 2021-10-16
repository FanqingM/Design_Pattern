package Management;

import java.io.IOException;
import java.util.Hashtable;

/**
 * @author: Yxxxb
 * @date: 2021/10/16 12:23
 * @description: 娱乐设施管理类工厂
 */
public class ManageFactory {
    private final Hashtable<String, Entertainment> FactoryTable = new Hashtable<String, Entertainment>();

    private static final ManageFactory singleton = new ManageFactory();

    public static ManageFactory getInstance() {
        return singleton;
    }

    public synchronized Entertainment getEntertainmentTourist(String EntertainmentName, String TouristType) throws IOException {
        Entertainment EM = (Entertainment) FactoryTable.get(EntertainmentName);
        if (EM == null) {
            System.out.println("Error! Without Authority!");
        } else {
            System.out.println("Exist!");
        }
        return EM;
    }

    public synchronized Entertainment getEntertainmentManage(String EntertainmentName, String TouristType, int WaitingTime) throws IOException {
        Entertainment EM = (Entertainment) FactoryTable.get(EntertainmentName);
        if (EM == null) {
            EM = new Entertainment(EntertainmentName, TouristType);

            // 设置权限
            EM.add_Authority(TouristType, true);
            EM.set_WaitingTime(WaitingTime);

            if (!EM.get_Authority())
                System.out.println("Error! Without Authority!");
            else {
                FactoryTable.put(EntertainmentName, EM);
                System.out.println("Add " + EntertainmentName);
            }
        } else {
            System.out.println("Exist!");
            EM.set_WaitingTime(WaitingTime);
        }
        return EM;
    }
}

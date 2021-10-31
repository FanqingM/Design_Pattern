package musementpark.online.Facade;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author: PandaLYZ
 * description:该类为ElectricSystem类，其作用是对游乐设施进行电路设施检测，采用单例模式实现
 */
public class ElectricSystem {
    private static ElectricSystem _singleton=new ElectricSystem();

    /**
     * description:私有构造函数，因为是单例模式
     */
    private ElectricSystem(){};

    /**
     * description: 供外界调用，获取该类的唯一实例
     * @return 返回该类的唯一实例_singleton
     */
    public static ElectricSystem getInstance(){
        return _singleton;
    }

    /**
     * description: 执行电路流通测试，并输出相关语句
     */
    public void doElectricTesting(){
        Print.print(new PrintInfo(
                "ElectricSystem",
                String.valueOf(System.identityHashCode(this)),
                "doElectricTesting",
                "进行设备电路流通测试！"
        ));
    }
}

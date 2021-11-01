package musementpark.online.facade;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author: PandaLYZ
 * description:该类为StructureSystem类，其作用是对游乐设施进行设备结构化检测，采用单例模式实现
 */
public class StructureSystem {
    private static StructureSystem _singleton=new StructureSystem();

    /**
     * description:私有构造函数，因为是单例模式
     */
    private StructureSystem(){};

    /**
     * description: 供外界调用，获取该类的唯一实例
     * @return 返回该类的唯一实例_singleton
     */
    public static StructureSystem getInstance(){
        return _singleton;
    }

    /**
     * description: 执行老化监测，并输出相关语句
     */
    public void doStructureTesting(){
        Print.print(new PrintInfo(
                "StructureSystem",
                String.valueOf(System.identityHashCode(this)),
                "doStructureTesting",
                "进行设备结构化测试"
        ));
    }
}

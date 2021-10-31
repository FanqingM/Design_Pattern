package musementpark.online.Facade;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author: PandaLYZ
 * description:该类为OperationAndMaintain_UI类，其向客户端提供了对游乐设施进行日常运维检修的一个接口，采用单例模式实现。同时，该类按顺序封装了进行运维检测的
 * 具体操作，只需要客户端调用类的doMaintenance方法即可完成对游乐设施的运维检测，因此使用了外观模式。减少了客户端与系统内部的耦合。
 */
public class OperationAndMaintain_UI {
    private static final OperationAndMaintain_UI _singleton=new OperationAndMaintain_UI();

    /**
     * description:私有构造函数，因为是单例模式
     */
    private OperationAndMaintain_UI(){};

    /**
     * description: 供外界调用，获取该类的唯一实例
     * @return 返回该类的唯一实例_singleton
     */
    public static OperationAndMaintain_UI getInstance(){
        return _singleton;
    }

    private static AgingTestSystem _agingTestSys = AgingTestSystem.getInstance();
    private static ElectricSystem _electricSys = ElectricSystem.getInstance();
    private static MechanicalSystem _mechanicalSys = MechanicalSystem.getInstance();
    private static StructureSystem _structureSys = StructureSystem.getInstance();

    /**
     * description:该方法是提供给客户端的接口，客户端只需要调用该方法即可完成运维检测所需的一系列操作
     */
    public void doMaintenance(){
        Print.print(new PrintInfo(
                "OperationAndMaintain_UI",
                String.valueOf(System.identityHashCode(this)),
                "doMaintenance",
                "开始对设备进行运维检测！"
        ));
        _electricSys.doElectricTesting();//进行电路连通性检测
        _mechanicalSys.doMechanicalTesting();//进行整体机械结构测试
        _structureSys.doStructureTesting();//进行机器结构稳定性测试
        _agingTestSys.doAgingTest();//进行设备老龄化测试
        Print.print(new PrintInfo(
                "OperationAndMaintain_UI",
                String.valueOf(System.identityHashCode(this)),
                "doMaintenance",
                "设备运维检测完成！"
        ));
    }

}

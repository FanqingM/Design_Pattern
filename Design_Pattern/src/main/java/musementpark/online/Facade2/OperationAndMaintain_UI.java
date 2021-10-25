package musementpark.online.Facade2;

public class OperationAndMaintain_UI {
    private static final OperationAndMaintain_UI _singleton=new OperationAndMaintain_UI();
    private OperationAndMaintain_UI(){};
    public static OperationAndMaintain_UI getInstance(){
        return _singleton;
    }

    private static AgingTestSystem _agingTestSys = AgingTestSystem.getInstance();
    private static ElectricSystem _electricSys = ElectricSystem.getInstance();
    private static MechanicalSystem _mechanicalSys = MechanicalSystem.getInstance();
    private static StructureSystem _structureSys = StructureSystem.getInstance();

    public void doMaintenance(){
        System.out.println("开始对设备进行运维检测！");
        _electricSys.switchElectric(); //首先打开电源
        _electricSys.doElectricTesting();//进行电路连通性检测
        _electricSys.cutElectric();//然后切断电源
        _mechanicalSys.checkMechanicalItem();//检查机械零部件完整性
        _mechanicalSys.doMechanicalTesting();//进行整体机械结构测试
        _structureSys.doStructureTesting();//进行机器结构稳定性测试
        _agingTestSys.doAgingTest();//进行设备老龄化测试
        System.out.println("设备运维检测完成！");
    }

}

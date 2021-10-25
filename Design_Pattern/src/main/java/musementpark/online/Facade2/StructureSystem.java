package musementpark.online.Facade2;

public class StructureSystem {
    private static StructureSystem _singleton=new StructureSystem();
    private StructureSystem(){};
    public static StructureSystem getInstance(){
        return _singleton;
    }
    public void doStructureTesting(){
        System.out.println("进行设备结构化测试");
    }
}

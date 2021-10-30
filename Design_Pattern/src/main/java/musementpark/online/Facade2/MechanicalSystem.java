package musementpark.online.Facade2;

public class MechanicalSystem {
    private static MechanicalSystem _singleton=new MechanicalSystem();
    private MechanicalSystem(){};
    public static MechanicalSystem getInstance(){
        return _singleton;
    }
    public void doMechanicalTesting(){
        System.out.println("进行机械动作测试！");
    }
    public void checkMechanicalItem(){
        System.out.println("检查机械零部件功能！");
    }
}

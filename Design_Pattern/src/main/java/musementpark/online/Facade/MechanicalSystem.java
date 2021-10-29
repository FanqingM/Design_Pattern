package musementpark.online.Facade;

public class MechanicalSystem {
    private static MechanicalSystem _singleton=new MechanicalSystem();
    private MechanicalSystem(){};
    public static MechanicalSystem getInstance(){
        return _singleton;
    }
    public void doMechanicalTesting(){
        System.out.println("进行机械动作测试！");
    }

}

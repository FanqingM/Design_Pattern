package musementpark.online.Facade1;

public class ElectricSystem {
    private static ElectricSystem _singleton=new ElectricSystem();
    private ElectricSystem(){};
    public static ElectricSystem getInstance(){
        return _singleton;
    }
    public void doElectricTesting(){
        System.out.println("进行设备电路流通测试！");
    }
}

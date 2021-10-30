package musementpark.online.Facade2;

public class ElectricSystem {
    private static ElectricSystem _singleton=new ElectricSystem();
    private ElectricSystem(){};
    public static ElectricSystem getInstance(){
        return _singleton;
    }
    public void cutElectric(){
        System.out.println("关闭设备电源");
    }
    public void switchElectric(){
        System.out.println("开启设备电源");
    }
    public void doElectricTesting(){
        System.out.println("进行设备电路流通测试！");
    }
}

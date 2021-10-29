package musementpark.online.Facade;

public class AgingTestSystem {
    private static AgingTestSystem _singleton=new AgingTestSystem();
    private AgingTestSystem(){};
    public static AgingTestSystem getInstance(){
        return _singleton;
    }
    public void doAgingTest(){
        System.out.println("进行设备老化检测！");
    }

}

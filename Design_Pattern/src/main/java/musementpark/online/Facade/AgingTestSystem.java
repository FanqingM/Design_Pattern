package musementpark.online.Facade;

/**
 * author: PandaLYZ
 * description:该类为AgingTestSystem类，其作用是对游乐设施进行老化检测，采用单例模式实现
 */
public class AgingTestSystem {
    private static AgingTestSystem _singleton=new AgingTestSystem();

    /**
     * description:私有构造函数，因为是单例模式
     */
    private AgingTestSystem(){};

    /**
     * description: 供外界调用，获取该类的唯一实例
     * @return 返回该类的唯一实例_singleton
     */
    public static AgingTestSystem getInstance(){
        return _singleton;
    }

    /**
     * description: 执行老化监测，并输出相关语句
     */

    public void doAgingTest(){
        System.out.println("进行设备老化检测！");
    }

}

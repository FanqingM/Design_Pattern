package musementpark.online.Facade;

/**
 * author: PandaLYZ
 * description:该类为MechanicalSystem类，其作用是对游乐设施进行机械动作检测，采用单例模式实现
 */
public class MechanicalSystem {
    private static MechanicalSystem _singleton=new MechanicalSystem();

    /**
     * description:私有构造函数，因为是单例模式
     */
    private MechanicalSystem(){};

    /**
     * description: 供外界调用，获取该类的唯一实例
     * @return 返回该类的唯一实例_singleton
     */
    public static MechanicalSystem getInstance(){
        return _singleton;
    }

    /**
     * description: 执行机械动作测试，并输出相关语句
     */
    public void doMechanicalTesting(){
        System.out.println("进行机械动作测试！");
    }

}

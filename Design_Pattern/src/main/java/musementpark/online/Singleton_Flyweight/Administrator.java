package musementpark.online.Singleton_Flyweight;

import musementpark.online.decorator.EntertainmentDecorator;

import java.util.Hashtable;

/**
 * author: Yxxxb
 * description: Administrator为游乐场管理员类 具有修改和设置游乐设施权限以及等候时间的功能。
 */
public class Administrator {
    private String _AdministratorInfo;
    //strategy
    private EntertainmentDecorator _WorkingEntertainmentDecorator;

    /*
     * 管理员构造函数
     * @param 娱乐设施实体对象
     * */
    public Administrator(EntertainmentDecorator entertainmentDecorator) {
        _WorkingEntertainmentDecorator = entertainmentDecorator;
    }

    /*
     * 修改策略模式指向对象
     * @param 娱乐设施实体对象
     * */
    public void set_WorkingEntertainment(EntertainmentDecorator entertainmentDecorator) {
        _WorkingEntertainmentDecorator = entertainmentDecorator;
    }

    /*
     * 修改权限哈希表
     * @param 权限哈希表
     * */
    public void set_EntertainmentAuthority(Hashtable<String, Boolean> authority) {
        _WorkingEntertainmentDecorator.set_Authority(authority);
    }

    /*
     * 修改等候时间哈希表
     * @param 等候时间哈希表
     * */
    public void set_EntertainmentWaitingTime(Hashtable<String, Integer> waitingTime) {
        _WorkingEntertainmentDecorator.set_WaitingTime(waitingTime);
    }
}

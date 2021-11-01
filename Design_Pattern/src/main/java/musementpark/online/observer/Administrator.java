package musementpark.online.observer;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

import java.util.Hashtable;

/**
 * author: Yxxxb
 * description: Administrator为游乐场管理员类 具有修改和设置游乐设施权限以及等候时间的功能。
 */
public class Administrator {
    private String _AdministratorInfo;
    //strategy
    private Entertainment _WorkingEntertainment;

    /*
     * 管理员构造函数
     * @param 娱乐设施实体对象
     * */
    public Administrator(Entertainment entertainment) {
        _WorkingEntertainment = entertainment;
    }

    /*
     * 修改策略模式指向对象
     * @param 娱乐设施实体对象
     * */
    public void set_WorkingEntertainment(Entertainment entertainment) {
        _WorkingEntertainment = entertainment;
    }

    /*
     * 修改权限哈希表
     * @param 权限哈希表
     * */
    public void set_EntertainmentAuthority(Hashtable<String, Boolean> authority) {
        String outputInfo = "\n管理员正在修改 " + _WorkingEntertainment.get_EntertainmentName() + " 的游客游玩权限\n" + "观察者为娱乐设施"
                + _WorkingEntertainment.get_EntertainmentName() + "的游客管理对象\n" + "被观察者为娱乐设施" + _WorkingEntertainment.get_EntertainmentName() + "\n";
        Print.print(
                new PrintInfo(
                        "Administrator",
                        String.valueOf(System.identityHashCode(this)),
                        "set_EntertainmentAuthority",
                        outputInfo
                )
        );

        _WorkingEntertainment.set_Authority(authority);
    }

    /*
     * 修改等候时间哈希表
     * @param 等候时间哈希表
     * */
    public void set_EntertainmentWaitingTime(Hashtable<String, Integer> waitingTime) {
        _WorkingEntertainment.set_WaitingTime(waitingTime);
    }
}

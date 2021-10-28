package musementpark.online.Observer;

import java.util.Hashtable;

/**
 * @author: Yxxxb
 * @date: 2021/10/28 13:54
 * @description:
 */
public class Administrator {
    private String _AdministratorInfo;
    //strategy
    private Entertainment _WorkingEntertainment;

    public Administrator(Entertainment entertainment) {
        _WorkingEntertainment = entertainment;
    }

    public void set_WorkingEntertainment(Entertainment entertainment) {
        _WorkingEntertainment = entertainment;
    }

    public void set_EntertainmentAuthority(Hashtable<String, Boolean> authority) {
        System.out.println("\n管理员正在修改 " + _WorkingEntertainment.get_EntertainmentName() + " 的游客游玩权限");
        System.out.println("观察者为娱乐设施" + _WorkingEntertainment.get_EntertainmentName() + "的游客管理对象");
        System.out.println("被观察者为娱乐设施" + _WorkingEntertainment.get_EntertainmentName());
        System.out.println();
        _WorkingEntertainment.set_Authority(authority);
    }

    public void set_EntertainmentWaitingTime(Hashtable<String, Integer> waitingTime) {
        _WorkingEntertainment.set_WaitingTime(waitingTime);
    }
}

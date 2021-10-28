package musementpark.online.Composite_Flyweight;

import java.util.Hashtable;

/**
 * @author: Yxxxb
 * @date: 2021/10/28 13:50
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
        _WorkingEntertainment.set_Authority(authority);
    }

    public void set_EntertainmentWaitingTime(Hashtable<String, Integer> waitingTime) {
        _WorkingEntertainment.set_WaitingTime(waitingTime);
    }
}

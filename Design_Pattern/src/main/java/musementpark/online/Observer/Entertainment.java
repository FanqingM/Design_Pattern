package musementpark.online.Observer;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * @author: Yxxxb
 * @date: 2021/10/28 13:54
 * @description:
 */
public class Entertainment {
    private final String _EntertainmentName;
    private boolean _OperatingState;
    // private Date _WorkingStartTime;
    // private Date _WorkingEndTime;
    // private int _ElseInfo; // other information
    private Hashtable<String, Boolean> _Authority;
    private Hashtable<String, Integer> _WaitingTime;
    // strategy 指向自己的array
    private List<OnlineEntertainment> _OnlineEntertainments;

    public Entertainment(String name) {
        _Authority = new Hashtable<String, Boolean>();
        _EntertainmentName = name;
        _OperatingState = false;
        _OnlineEntertainments = new ArrayList<>();
    }

    // 观察者 修改authority
    private void UpdateAllAuthority() {
        for (OnlineEntertainment onlineEntertainment : _OnlineEntertainments) {
            onlineEntertainment.set_Authority(_Authority.get(onlineEntertainment.get_TouristType()));
            String Authority = _Authority.get(onlineEntertainment.get_TouristType()) ? "有游玩权限" : "无游玩权限";
            System.out.println(_EntertainmentName + " 游乐设施的 " + onlineEntertainment.get_TouristType() + " 类客户游玩权限已被修改为 " + Authority);
        }
        System.out.println("\n本游乐设施的所有游客管理对象的游玩权限均被修改完成！");
    }

    private void UpdateAllWaitingTime() {
        for (OnlineEntertainment onlineEntertainment : _OnlineEntertainments) {
            onlineEntertainment.set_WaitingTime(_WaitingTime.get(onlineEntertainment.get_TouristType()));
        }
        System.out.println("\n本游乐设施的所有游客管理对象的等候时间均被修改完成！");
    }

    public void RemoveEntertainment() {
    }

    ;

    public void AddEntertainment() {
    }

    ;

    public String get_EntertainmentName() {
        return _EntertainmentName;
    }

    public void addEntertainments(OnlineEntertainment entertainment) {
        _OnlineEntertainments.add(entertainment);
    }

    public boolean get_OperatingState() {
        return _OperatingState;
    }

    public void set_OperatingState(boolean OperatingState) {
        _OperatingState = OperatingState;
    }

    // 供管理员以及test调用
    public void add_Authority(String AuthorityType, Boolean TimeAndAuthority) {
        _Authority.put(AuthorityType, TimeAndAuthority);
        UpdateAllAuthority();
    }

    public void set_Authority(Hashtable<String, Boolean> authority) {
        _Authority = authority;
        UpdateAllAuthority();
    }

    public void set_WaitingTime(Hashtable<String, Integer> waitingTime) {
        _WaitingTime = waitingTime;
        UpdateAllWaitingTime();
    }

    public Hashtable<String, Boolean> get_Authority() {
        return _Authority;
    }
}

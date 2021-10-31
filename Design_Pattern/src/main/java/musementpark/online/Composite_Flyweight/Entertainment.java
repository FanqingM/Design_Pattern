package musementpark.online.Composite_Flyweight;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * author: Yxxxb
 * description: 娱乐设施类 具有娱乐设施的一些基本属性 也可以对同类的线上游乐设施对象进行管理
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

    /*
     * 构造函数
     * @param 娱乐设施名
     * */
    public Entertainment(String name) {
        _Authority = new Hashtable<String, Boolean>();
        _EntertainmentName = name;
        _OperatingState = false;
        _OnlineEntertainments = new ArrayList<>();
    }

    /*
     * 观察者 修改权限
     * @param 无
     * */
    private void UpdateAllAuthority() {
        for (OnlineEntertainment onlineEntertainment : _OnlineEntertainments) {
            onlineEntertainment.set_Authority(_Authority.get(onlineEntertainment.get_TouristType()));
        }
    }

    /*
     * 观察者 修改等候时间
     * @param 无
     * */
    private void UpdateAllWaitingTime() {
        for (OnlineEntertainment onlineEntertainment : _OnlineEntertainments) {
            onlineEntertainment.set_WaitingTime(_WaitingTime.get(onlineEntertainment.get_TouristType()));
        }
    }

    /*
     * 移除观察者
     * @param 无
     * */
    public void RemoveEntertainment() {
    }

    ;

    /*
     * 新增观察者
     * @param 无
     * */
    public void AddEntertainment() {
    }

    ;

    /*
     * 获取娱乐设施名
     * @param 无
     * */
    public String get_EntertainmentName() {
        return _EntertainmentName;
    }

    /*
     * 策略模式 新增观察者
     * @param 线上娱乐设施对象
     * */
    public void addEntertainments(OnlineEntertainment entertainment) {
        _OnlineEntertainments.add(entertainment);
    }

    /*
     * 获取操作状态
     * @param 无
     * */
    public boolean get_OperatingState() {
        return _OperatingState;
    }

    /*
     * 设置娱乐设置状态
     * @param 无
     * */
    public void set_OperatingState(boolean OperatingState) {
        _OperatingState = OperatingState;
    }

    /*
     * 新增权限列表
     * @param 无
     * */
    public void add_Authority(String AuthorityType, Boolean TimeAndAuthority) {
        _Authority.put(AuthorityType, TimeAndAuthority);
        UpdateAllAuthority();
    }

    /*
     * 设置权限列表
     * @param 权限哈希表
     * */
    public void set_Authority(Hashtable<String, Boolean> authority) {
        _Authority = authority;
        UpdateAllAuthority();
    }

    /*
     * 设置等候时间列表
     * @param 等候时间哈希表
     * */
    public void set_WaitingTime(Hashtable<String, Integer> waitingTime) {
        _WaitingTime = waitingTime;
        UpdateAllWaitingTime();
    }

    /*
     * 获取对应游客状态的权限
     * @param 无
     * */
    public Hashtable<String, Boolean> get_Authority() {
        return _Authority;
    }
}

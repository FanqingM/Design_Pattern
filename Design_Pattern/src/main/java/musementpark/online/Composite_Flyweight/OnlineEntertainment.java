package musementpark.online.Composite_Flyweight;

/**
 * @author: Yxxxb
 * @date: 2021/10/28 13:52
 * @description:
 */
public class OnlineEntertainment {
    // 内部状态：游客类型 游乐设施名称
    private final String _EntertainmentName;
    private final String _TouristType;
    private Boolean _Authority;

    // 外部状态：等候时间 是否玩过 剩余游玩次数等等
    private int _WaitingTime;
    private int _ElseInfo;

    // strategy 指向Entertainment
    public OnlineEntertainment(String name, String TouristType, Entertainment _Entertainment) {
        _WaitingTime = -1;
        _TouristType = TouristType;
        _EntertainmentName = name;
        _Authority = _Entertainment.get_Authority().get(_TouristType); // 错误处理 待添加
        _Entertainment.addEntertainments(this);
//        System.out.println(name + " Entertainment has been constructed!");
    }

    public Boolean get_Authority() {
        return _Authority;
    }

    // 对Authority和TouristType的操作 状态模式
    public void set_Authority(Boolean authority) {
        _Authority = authority;
    }

    public String get_TouristType() {
        return _TouristType;
    }

    public int get_WaitingTime() {
        return _WaitingTime;
    }

    public void set_WaitingTime(int WaitingTime) {
        _WaitingTime = WaitingTime;
    }

    public void show() {
        String TouristAuthority = get_Authority() ? "有游玩权限" : "无游玩权限";
        int waitingtime = Math.max(_WaitingTime, 0);
        System.out.println(_EntertainmentName + " 等候时间： " + waitingtime + " 游客游玩权限： " + TouristAuthority + " 游客类型： " + _TouristType);
    }
}

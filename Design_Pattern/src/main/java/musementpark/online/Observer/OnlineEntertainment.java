package musementpark.online.Observer;

/**
 * author: Yxxxb
 * description: 线上游乐设施类 也是享元类
 */
public class OnlineEntertainment {
    // 内部状态：游客类型 游乐设施名称
    private final String _EntertainmentName;
    private final String _TouristType;
    private Boolean _Authority;

    // 外部状态：等候时间 是否玩过 剩余游玩次数等等
    private int _WaitingTime;
    private int _ElseInfo;

    /*
     * 构造函数
     * @param String name, String TouristType, Entertainment _Entertainment
     * */
    public OnlineEntertainment(String name, String TouristType, Entertainment _Entertainment) {
        _WaitingTime = -1;
        _TouristType = TouristType;
        _EntertainmentName = name;
        _Authority = _Entertainment.get_Authority().get(_TouristType); // 错误处理 待添加
        _Entertainment.addEntertainments(this);
        System.out.println(name + " " + TouristType + " 游乐设施线上管理类已被创建");
    }

    /*
     * 获取权限
     * @param 无
     * */
    public Boolean get_Authority() {
        return _Authority;
    }

    /*
     * 设置权限
     * @param 无
     * */
    public void set_Authority(Boolean authority) {
        _Authority = authority;
    }

    /*
     * 获取游客类型
     * @param 无
     * */
    public String get_TouristType() {
        return _TouristType;
    }

    /*
     * 获取等候时间
     * @param 无
     * */
    public int get_WaitingTime() {
        return _WaitingTime;
    }

    /*
     * 设置等候时间
     * @param 无
     * */
    public void set_WaitingTime(int WaitingTime) {
        _WaitingTime = WaitingTime;
    }

    /*
     * show函数 输出用
     * @param 无
     * */
    public void show() {
        String TouristAuthority = get_Authority() ? "Has Authority!" : "No Authority";
        int waitingtime = Math.max(_WaitingTime, 0);
        System.out.println(_EntertainmentName + " WaitingTime: " + waitingtime + " TouristAuthority：" + TouristAuthority + " TouristType: " + _TouristType);
    }
}

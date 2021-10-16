package Management;

/**
 * @author: Yxxxb
 * @date: 2021/10/16 12:22
 * @description: 虚拟/管理娱乐设施类
 */
public class Entertainment extends EntertainmentImp {
    private final String _TouristType;

    public Entertainment(String name, String TouristType) {
        super(name);
        _TouristType = TouristType;
        System.out.println(name + " Entertainment has been constructed!");
    }

    public Boolean get_Authority() {
        // 错误处理 待添加
        return _Authority.get(_TouristType);
    }

    public int get_WaitingTime() {
        return _WaitingTime;
    }

    public void show() {
        String TouristAuthority = get_Authority() ? "Has Authority!" : "No Authority";
        System.out.println(get_EntertainmentName() + " WaitingTime: " + _WaitingTime + " TouristAuthority：" + TouristAuthority + " TouristType: " + _TouristType);
    }
}

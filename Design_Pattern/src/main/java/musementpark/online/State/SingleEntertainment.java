package musementpark.online.State;

import java.util.Hashtable;

/**
 * author: Yxxxb
 * description:单一娱乐设施类
 */
public class SingleEntertainment {
    private final String _EntertainmentName;
    private Hashtable<String, Boolean> _Authority;

    /*
     * 构造函数
     * @param 娱乐设施名
     * */
    public SingleEntertainment(String name) {
        _Authority = new Hashtable<String, Boolean>();
        _EntertainmentName = name;

        _Authority.put("vip", true);
        _Authority.put("normal", false);
        _Authority.put("daytime", true);
        _Authority.put("nighttime", false);
    }


    /*
     * 获取对应游客状态的权限
     * @param 无
     * */
    public Hashtable<String, Boolean> get_Authority() {
        return _Authority;
    }
}

package musementpark.online.State;

import musementpark.online.Bridge.Status;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author: Yxxxb
 * description:NightTime客户类 继承Status
 */
public class NightTime extends Status {
    private final String _StateName;
    private final SingleEntertainment _SingleEntertainment;

    /**
     * 构造函数
     *
     * @param name
     * @param singleEntertainment
     */
    public NightTime(String name, SingleEntertainment singleEntertainment) {
        _StateName = name;
        _SingleEntertainment = singleEntertainment;
    }

    /**
     * 获取折扣信息
     *
     * @return 无
     */
    @Override
    public double getDiscount() {
        return 0;
    }

    /**
     * 获取权限信息
     *
     * @return 游客权限
     */
    @Override
    public Boolean getAuthority() {
        String authority = _SingleEntertainment.get_Authority().get(_StateName) ? "拥有权限" : "没有权限";
        String outputInfo = _StateName + "该玩家" + authority + "游玩此游乐设施";
        Print.print(
                new PrintInfo(
                        "NightTime",
                        String.valueOf(System.identityHashCode(this)),
                        "getAuthority",
                        outputInfo
                )
        );
        return _SingleEntertainment.get_Authority().get(_StateName);
    }
}

package musementpark.online.State;

import musementpark.online.Bridge.Status;

/**
 * @author: Yxxxb
 * @date: 2021/10/31 13:09
 * @description:
 */
public class Normal extends Status {
    private final String _StateName;
    private final SingleEntertainment _SingleEntertainment;

    public Normal(String name, SingleEntertainment singleEntertainment) {
        _StateName = name;
        _SingleEntertainment = singleEntertainment;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    @Override
    public Boolean getAuthority() {
        String authority = _SingleEntertainment.get_Authority().get(_StateName) ? "拥有权限" : "没有权限";
        System.out.println(_StateName + "该玩家" + authority + "游玩此游乐设施");
        return _SingleEntertainment.get_Authority().get(_StateName);
    }
}

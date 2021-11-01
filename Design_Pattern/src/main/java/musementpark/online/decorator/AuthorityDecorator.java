package musementpark.online.decorator;

import musementpark.offline.entertainment.composite.Component;

import java.util.Hashtable;

public class AuthorityDecorator extends EntertainmentDecorator{
    public AuthorityDecorator(Component component) {
        super(component);
    }
    /*
     * 设置权限列表
     * @param 权限哈希表
     * */
    @Override
    public void set_Authority(Hashtable<String, Boolean> authority) {
        _Authority = authority;
        UpdateAllAuthority();
    }

}

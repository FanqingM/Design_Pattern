package musementpark.online.State;

/**
 * author: Yxxxb
 * description: 拥有权限类 继承状态类
 */
public class WithAuthorityState implements State {
    /*
     * 拥有权限输出函数
     * @param 游客对象
     * */
    public void show(Tourist tourist) {
        System.out.println("游客拥有游玩此游乐设施的权限");
        tourist.set_state(this);
    }
}

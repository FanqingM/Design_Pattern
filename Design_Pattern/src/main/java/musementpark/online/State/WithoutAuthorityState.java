package musementpark.online.State;

/**
 * author: Yxxxb
 * description: 不拥有权限类 继承状态类
 */
public class WithoutAuthorityState implements State {
    /*
     * 未拥有权限输出函数
     * @param 游客对象
     * */
    public void show(Tourist tourist) {
        System.out.println("游客没有游玩此游乐设施的权限");
        tourist.set_state(this);
    }
}

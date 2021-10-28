package musementpark.online.State;

/**
 * @author: Yxxxb
 * @date: 2021/10/28 13:57
 * @description:
 */
public class WithAuthorityState implements State {
    public void show(Tourist tourist) {
        System.out.println("游客拥有游玩此游乐设施的权限");
        tourist.set_state(this);
    }
}

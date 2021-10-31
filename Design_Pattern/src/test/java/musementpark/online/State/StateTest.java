package musementpark.online.State;

/**
 * author: Yxxxb
 * description: 状态模式测试类
 */
public class StateTest {
    public static void main(String[] args) {
        System.out.println("状态模式测试\n");

        Tourist tourist = new Tourist();

        WithAuthorityState withAuthorityState = new WithAuthorityState();
        tourist.set_state(withAuthorityState);
        tourist.get_state().show(tourist);

        System.out.println("管理员更改顾客游玩权限");

        WithoutAuthorityState withoutAuthorityState = new WithoutAuthorityState();
        tourist.set_state(withoutAuthorityState);
        tourist.get_state().show(tourist);
    }
}

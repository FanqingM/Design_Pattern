package musementpark.online.State;

/**
 * author: Yxxxb
 * description: 状态模式测试类
 */
public class StateTest {
    public static void main(String[] args) {
        System.out.println("状态模式测试\n");

        SingleEntertainment singleEntertainment = new SingleEntertainment("旋转木马");
        Tourist visitor = new Tourist("normal", singleEntertainment);
        visitor.ChangeTouristType("normal", "vip");
    }
}

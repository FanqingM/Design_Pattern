package musementpark.online.Strategy;

/**
 * @author: Yxxxb
 * @date: 2021/10/30 12:01
 * @description:
 */
public class StrategyTest {
    public static void main(String[] args) {
        Administrator administrator = new Administrator(new Route1());
        administrator.executeRoute("vip");

        administrator = new Administrator(new Route2());
        administrator.executeRoute("normal");

        administrator = new Administrator(new Route3());
        administrator.executeRoute("daytime");
    }
}

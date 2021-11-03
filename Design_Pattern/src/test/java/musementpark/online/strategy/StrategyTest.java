package musementpark.online.strategy;

import musementpark.util.Print;
import musementpark.util.PrintInfo;
import org.junit.jupiter.api.Test;

import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

/**
 * author: Yxxxb
 * description: 策略模式测试类
 */
public class StrategyTest {
    @Test
    public void StrategyTest() {
        Route1 route1 = new Route1();
        Route2 route2 = new Route2();
        Route3 route3 = new Route3();
        Administrator administrator1 = new Administrator(route1);

        Administrator administrator2 = new Administrator(route2);

        Administrator administrator3 = new Administrator(route3);

        Hashtable<Integer, Administrator> administratorHashtable = new Hashtable<>();
        administratorHashtable.put(1, administrator1);
        administratorHashtable.put(2, administrator2);
        administratorHashtable.put(3, administrator3);
//        System.out.println("请选择您的门票类型：" + "\n1.normal\n2.vip\n3.daytime\n4.nighttime");
        String type = "normal";

        Random r = new Random();
        int choice = r.nextInt(2) + 1;
        Print.print(
                new PrintInfo(
                        "Administrator",
                        String.valueOf(System.identityHashCode(this)),
                        "getRoute",
                        route1.getRoute(type)
                )
        );
        Print.print(
                new PrintInfo(
                        "Administrator",
                        String.valueOf(System.identityHashCode(this)),
                        "getRoute",
                        route2.getRoute(type)
                )
        );
        Print.print(
                new PrintInfo(
                        "Administrator",
                        String.valueOf(System.identityHashCode(this)),
                        "getRoute",
                        route3.getRoute(type)
                )
        );
        administratorHashtable.get(choice).executeRoute(type);
    }
}

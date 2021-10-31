package musementpark.online.Strategy;

import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

/**
 * author: Yxxxb
 * description: 策略模式测试类
 */
public class StrategyTest {
    public static void main(String[] args) {
        Administrator administrator1 = new Administrator(new Route1());

        Administrator administrator2 = new Administrator(new Route2());

        Administrator administrator3 = new Administrator(new Route3());

        Hashtable<Integer, Administrator> administratorHashtable = new Hashtable<>();
        administratorHashtable.put(1, administrator1);
        administratorHashtable.put(2, administrator2);
        administratorHashtable.put(3, administrator3);

        System.out.println("请选择您的门票类型：" + "\n1.normal\n2.vip\n3.daytime\n4.nighttime");
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        String type = scanner.nextLine(); // 读取一行输入并获取字符串

        Random r = new Random();
        int choice = r.nextInt(2) + 1;

        administratorHashtable.get(choice).executeRoute(type);
    }
}

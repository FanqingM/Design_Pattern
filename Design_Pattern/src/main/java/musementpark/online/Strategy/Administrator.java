package musementpark.online.Strategy;


import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author: Yxxxb
 * description: Administrator为游乐场管理员类 推荐路径
 */
public class Administrator {
    private final RouteStrategy routeStrategy;

    /*
     * 构造函数
     * @param RouteStrategy routeStrategy
     * */
    public Administrator(RouteStrategy routeStrategy){
        this.routeStrategy = routeStrategy;
    }

    /*
     * 输出游客类型及推荐路径
     * @param String touristType
     * */
    public String executeRoute(String touristType){
        String outputInfo = "推荐路径为：" + routeStrategy.getRoute(touristType);
        Print.print(
                new PrintInfo(
                        "Administrator",
                        String.valueOf(System.identityHashCode(this)),
                        "executeRoute",
                        outputInfo
                )
        );
        return routeStrategy.getRoute(touristType);
    }
}

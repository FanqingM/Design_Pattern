package musementpark.online.Strategy;

/**
 * author: Yxxxb
 * description: 路径推荐策略接口
 */
public interface RouteStrategy {
    /*
     * 获取游玩路径虚函数
     * @param String touristType
     * */
    public String getRoute (String touristType);
}

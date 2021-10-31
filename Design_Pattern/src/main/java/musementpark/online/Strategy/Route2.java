package musementpark.online.Strategy;

/**
 * author: Yxxxb
 * description: 路径二
 */
public class Route2 implements RouteStrategy{
    /*
     * 获取游玩路径
     * @param String touristType
     * */
    @Override
    public String getRoute (String touristType){
        return touristType + " Route2";
    }
}

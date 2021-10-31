package musementpark.online.Strategy;

/**
 * author: Yxxxb
 * description: 路径一
 */
public class Route1 implements RouteStrategy{
    /*
     * 获取游玩路径
     * @param String touristType
     * */
    @Override
    public String getRoute (String touristType){
        return touristType + " Route1";
    }
}

package musementpark.online.Strategy;

/**
 * author: Yxxxb
 * description: 路径三
 */
public class Route3 implements RouteStrategy{
    /*
     * 获取游玩路径
     * @param String touristType
     * */
    @Override
    public String getRoute (String touristType){
        return touristType + " Route3";
    }
}

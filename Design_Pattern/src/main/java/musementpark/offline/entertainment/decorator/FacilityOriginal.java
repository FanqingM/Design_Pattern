package musementpark.offline.entertainment.decorator;
/**
 * author：FanqingM
 * description：未获得装饰的游乐设施
 */
import musementpark.offline.entertainment.composite.Component;

public class FacilityOriginal extends Component {
    /**
     * 得到该节点名字
     * @return
     */
    @Override
    public String getName() {
        return "娱乐设施";
    }
}


package musementpark.offline.entertainment.decorator;
/*
被装饰者
 */
public class FacilityOriginal extends Facility {
    @Override
    protected String getDesc() {
        return "娱乐设施";
    }
    @Override
    protected int cost() {
        return 8;
    }
}


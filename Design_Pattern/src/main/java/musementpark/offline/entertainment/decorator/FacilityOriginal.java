package musementpark.offline.entertainment.decorator;

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


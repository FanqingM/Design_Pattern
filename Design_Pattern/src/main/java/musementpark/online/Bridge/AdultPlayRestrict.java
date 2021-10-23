package musementpark.online.Prototype_Bridge.PlayRestrict;

public class AdultPlayRestrict implements PlayRestrict {

    @Override
    public void playWhirligig(String visitorName) {
        System.out.println(visitorName+"可以玩旋转木马");
    }

    @Override
    public void playKarting(String visitorName) {
        System.out.println(visitorName+"可以玩卡丁车");
    }
}

package musementpark.online.AbstractFactory;

public class WhirligigFactory implements AbstractFactory {
    @Override
    public Gift getGift() {
        return new WhirligigGift();
    }

    @Override
    public SouvenirMedal getSouvenirMedal() {
        return new WhirligigSouvenirMedal();
    }
}

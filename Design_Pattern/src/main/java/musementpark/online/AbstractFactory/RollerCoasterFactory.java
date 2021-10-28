package musementpark.online.AbstractFactory;

public class RollerCoasterFactory implements AbstractFactory{
    @Override
    public Gift getGift() {
        return new RollerCoasterGift();
    }

    @Override
    public SouvenirMedal getSouvenirMedal() {
        return new RollerCoasterSouvenirMedal();
    }
}

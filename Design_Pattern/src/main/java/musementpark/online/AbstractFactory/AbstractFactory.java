package musementpark.online.AbstractFactory;

import musementpark.online.Prototype.Visitor;


public interface AbstractFactory {
    public Gift getGift();
    public SouvenirMedal getSouvenirMedal();
}

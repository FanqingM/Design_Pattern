package musementpark.online.AbstractFactory;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory=FactoryProducer.getFactory("Whirligig");
        factory.getGift();
        factory.getSouvenirMedal();

        factory=FactoryProducer.getFactory("rollercoaster");
        factory.getGift();
        factory.getSouvenirMedal();
    }
}
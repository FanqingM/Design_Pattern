package musementpark.online.abstractFactory;

import org.junit.jupiter.api.Test;

class AbstractFactoryTest {
    @Test
    public void AbstractFactoryTest() {
        AbstractFactory factory=FactoryProducer.getFactory("Whirligig");
        factory.getGift();
        factory.getSouvenirMedal();

        factory=FactoryProducer.getFactory("rollercoaster");
        factory.getGift();
        factory.getSouvenirMedal();
    }
}
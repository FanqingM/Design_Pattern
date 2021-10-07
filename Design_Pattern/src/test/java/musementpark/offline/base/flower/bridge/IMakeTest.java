package musementpark.offline.base.flower.bridge;

import org.junit.jupiter.api.Assertions.*;
import musementpark.offline.base.flower.bridge.*;
import org.junit.jupiter.api.Test;

class IMakeTest {
    @Test
    public void plantTest() {
        Chrysanthemum chrysanthemum = new Chrysanthemum();
        chrysanthemum.setColor(new Red());
        chrysanthemum.plant();
        Chrysanthemum chrysanthemum2 = new Chrysanthemum();
        chrysanthemum2.setColor(new Yellow());
        chrysanthemum2.plant();
        WinterSweet winterSweet = new WinterSweet();
        winterSweet.setColor(new Red());
        winterSweet.plant();
        WinterSweet winterSweet2 = new WinterSweet();
        winterSweet2.setColor(new Yellow());
        winterSweet2.plant();
    }
}
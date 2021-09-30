package musementpark.offline.base.chair.flyweight;

/*
author: Fanqing_M
description: chair对应的test的demo code
 */

import org.junit.jupiter.api.Test;
import musementpark.offline.base.chair.flyweight.Chair;
import static org.junit.jupiter.api.Assertions.*;

class ChairTest {
    @Test
    void testChairFlyweight() {
        Chair chair = new Chair();
        chair.test();
    }
}

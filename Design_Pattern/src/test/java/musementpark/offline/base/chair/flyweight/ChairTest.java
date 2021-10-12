package musementpark.offline.base.chair.flyweight;

/*
author: Fanqing_M
description: chair对应的test的demo code
 */

import org.junit.jupiter.api.Test;

class ChairTest {
    @Test
    void testChairFlyweight() {
        Chair chair = new Chair();
        chair.test();
    }
}

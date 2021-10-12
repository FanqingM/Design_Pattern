package musementpark.offline.base.tourbus.flyweight;

/*
author: LRZ
description: tourbus对应的test的demo code
 */

import org.junit.jupiter.api.Test;
import musementpark.offline.base.tourbus.flyweight.Tourbus;
import static org.junit.jupiter.api.Assertions.*;

class TourbusTest {
    @Test
    void testTourbusFlyweight() {
        Tourbus tourbus = new Tourbus();
        tourbus.test();
    }
}
package musementpark.offline.base.manage.composite;

/*
author: 1952396
description: manager composite对应的test的demo code
 */

import musementpark.offline.base.manage.decorator.Decorator;
import org.junit.jupiter.api.Test;

public class CompositeTest {
    @Test
    void testComposite(){
        CompositeManage boss=new CompositeManage("boss","manage");
        LeafManage HR =new LeafManage("HR","nothing");
        boss.addComponent(HR);
        boss.removeComponent(HR);
        boss.check();
    }
}
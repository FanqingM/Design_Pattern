package musementpark.offline.base.flower.adapter;
/*
author: FanqingM
description: 迭代器模式客户端代码
 */
import org.junit.jupiter.api.Assertions.*;
import musementpark.offline.base.flower.adapter.*;
import org.junit.jupiter.api.Test;

class AdapterTest {
    @Test
    public void plantForWinter() {
        Normal normal = new Normal();
        Winter winter = new Winter();
        Adapter adapter = new Adapter();
        int aNormal[] = normal.supply();
        //未使用Adapter
        winter.charge(aNormal);
        adapter.convert(aNormal);
        //使用适配器后
        winter.charge(aNormal);
    }
}
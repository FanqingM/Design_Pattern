package musementpark.offline.base.flower.adapter;

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
//    public void chargeForPhone() {
//        HomeBattery homeBattery = new HomeBattery();
//        int homeVolt = homeBattery.supply();
//        System.out.println("家庭电源提供的电压是 " + homeVolt + "V");
//
//        Adapter adapter = new Adapter();
//        int chargeVolt = adapter.convert(homeVolt);
//        System.out.println("使用适配器将家庭电压转换成了 " + chargeVolt + "V");
//
//        USBLine usbLine = new USBLine();
//        usbLine.charge(chargeVolt);
//    }
}
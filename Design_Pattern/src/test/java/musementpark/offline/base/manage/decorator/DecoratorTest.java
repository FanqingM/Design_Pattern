package musementpark.offline.base.manage.decorator;

import org.junit.jupiter.api.Test;

public class DecoratorTest {
    @Test
    void testDecorator(){
        Decorator HD= new Decorator("HD","yingyingying","wuhu");
        HD.setDeco();
    }
}

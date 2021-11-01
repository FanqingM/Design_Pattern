package musementpark.offline.management.proxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {
    @Test
    public void ProxyTest() {
        ReadFile boss = new Boss();

        InvocationHandler handler = new Secretary(boss);

        ReadFile secretary = (ReadFile) Proxy.newProxyInstance(
                boss.getClass().getClassLoader(),
                boss.getClass().getInterfaces(),
                handler);

        secretary.read();
    }


}
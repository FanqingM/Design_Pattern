package musementpark.offline.management.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {
    public static void main(String[] args) {
        ReadFile boss = new Boss();

        InvocationHandler handler = new Secretary(boss);

        ReadFile secretary = (ReadFile) Proxy.newProxyInstance(
                boss.getClass().getClassLoader(),
                boss.getClass().getInterfaces(),
                handler);

        secretary.read();
    }


}
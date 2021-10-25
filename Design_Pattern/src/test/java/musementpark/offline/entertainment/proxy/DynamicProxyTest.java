package musementpark.offline.entertainment.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import static org.junit.jupiter.api.Assertions.*;

class DynamicProxyTest {
    public static void main(String[] args) {
        //构造一个小明
        IRoom xiaoMing = new XiaoMing();
        //构造一个动态代理

        InvocationHandler dynamicProxy = new DynamicProxy(xiaoMing);
        //获取被代理类小明的ClassLoader
        ClassLoader classLoader = xiaoMing.getClass().getClassLoader();

        //1、通过Proxy类的newProxyInstance方法动态构造一个代理人房产中介
        IRoom roomAgency = (IRoom) Proxy.newProxyInstance(classLoader, new Class[]{IRoom.class}, dynamicProxy);

        //调用代理对象的方法

        //房产中介找房
        roomAgency.watchRoom();
        //房产中介看房
        roomAgency.seekRoom();
        //房产中介租房
        roomAgency.room();
        //房产中介完成租房
        roomAgency.finish();
    }

}
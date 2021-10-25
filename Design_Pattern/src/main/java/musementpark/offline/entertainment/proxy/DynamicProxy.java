package musementpark.offline.entertainment.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//实现了InvocationHandler接口的动态代理类
public class DynamicProxy implements InvocationHandler {

    private Object mObject;//真实对象的引用

    public DynamicProxy(Object object){
        this.mObject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过反射调用真实对象的方法
        Object result = method.invoke(mObject, args);
        return result;
    }
}


package musementpark.offline.management.proxy;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Secretary implements InvocationHandler {

    private Object object;

    public Secretary(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Print.print(
                new PrintInfo(
                        "Secretary",
                        String.valueOf(System.identityHashCode(this)),
                        "invoke",
                        "我是秘书"
                )
        );
        Object result = method.invoke(object, args);

        return result;
    }

}

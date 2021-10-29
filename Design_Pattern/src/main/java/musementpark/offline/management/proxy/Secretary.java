package musementpark.offline.management.proxy;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * author：FanqingM
 * description：秘书类，这里采用动态代理，可以动态的给秘书增加职责
 */
public class Secretary implements InvocationHandler {

    private Object object;

    /**
     * 构造秘书
     * @param object
     */
    public Secretary(Object object) {
        this.object = object;
    }

    /**
     * 构造代理，这里通过秘书来代理老板的读文件工作，这样写的好处时可以选择性的代理老板工作
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
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

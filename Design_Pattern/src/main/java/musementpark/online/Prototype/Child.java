package musementpark.online.Prototype;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author: DannyXSC
 * description: Child类继承了Visitor类，表示儿童类型的游客，对于游客的生成我们采用了原型模式，将每一种类型的游客都登记在父类中
 */
public class Child extends Visitor{
    private static final Child _child = new Child();

    /**
     * description: 私有的构造函数，当该类在Jvm中加载时，就将静态的自己注册到父类中
     */
    private Child(){addPrototype(this);}
    /**
     * description: 私有的构造函数，供clone方法生成对象时调用
     */
    private Child(int dump){}

    /**
     * description:重写了父类的clone方法，返回一个该类的对象
     * @return 返回值为Child类型的对象
     */
    @Override
    public Child clone() {
        return new Child(1);
    }
    /**
     * description:重写了父类的getStatus方法，打印出该游客的身份以及对应的折扣
     */
    @Override
    public void getStatus() {
        Print.print(new PrintInfo(
                "Child",
                String.valueOf(System.identityHashCode(this)),
                "getStatus",
                "child的地位是"+_status.getClass().getSimpleName()+",对应折扣是"+_status.getDiscount()
        ));
    }

    /**
     * description: 该类不是空游客类，所以返回false
     * @return 返回false
     */
    @Override
    public boolean isNull() {
        return false;
    }
}

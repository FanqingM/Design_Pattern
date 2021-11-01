package musementpark.online.prototype;

import musementpark.online.bridge.Status;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author: DannyXSC
 * description: Adult类继承了Visitor类，表示成人类型的游客，对于游客的生成我们采用了原型模式，将每一种类型的游客都登记在父类中
 */
public class Adult extends Visitor {
    private static final Adult _adult = new Adult();

    /**
     * description: 私有的构造函数，当该类在Jvm中加载时，就将静态的自己注册到父类中
     */
    private Adult() {
        addPrototype(this);
    }

    /**
     * description: 私有的构造函数，供clone方法生成对象时调用
     */
    private Adult(int dump) {
    }

    /**
     * description:重写了父类的clone方法，返回一个该类的对象
     *
     * @return 返回值为Adult类型的对象
     */
    @Override
    public Adult clone() {
        return new Adult(1);
    }

    /**
     * description:重写了父类的getStatus方法，打印出该游客的身份以及对应的折扣
     */
    @Override
    public Status getStatus() {
        Print.print(new PrintInfo(
                "Adult",
                String.valueOf(System.identityHashCode(this)),
                "getStatus",
                "adult的地位是" + _status.getClass().getSimpleName() + ",对应折扣是" + _status.getDiscount()
        ));
        return _status;
    }

    /**
     * description: 该类不是空游客类，所以返回false
     *
     * @return 返回false
     */
    @Override
    public boolean isNull() {
        return false;
    }
}

package musementpark.online.nullObject;

import musementpark.online.bridge.Status;
import musementpark.online.prototype.Visitor;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author:DannyXSC
 * description: 该类继承了Visitor类，表示空参观者，当生成Visitor时，所传来的参数不在adult，child或elder中时返回一个NullVisitor类
 */
public class NullVisitor extends Visitor {
    private static final NullVisitor _nullVisitor = new NullVisitor();

    private NullVisitor() {
        addPrototype(this);
    }

    private NullVisitor(int dump) {
    }

    @Override
    public NullVisitor clone() {
        return new NullVisitor(1);
    }

    @Override
    public Status getStatus() {
        Print.print(new PrintInfo(
                "NullVisitor",
                String.valueOf(System.identityHashCode(this)),
                "getStatus",
                "NullVisitor可以调用getStatus但是没有任何作用"
        ));
        return _status;
    }

    @Override
    public boolean isNull() {
        Print.print(new PrintInfo(
                "NullVisitor",
                String.valueOf(System.identityHashCode(this)),
                "isNull",
                "NullVisitor是null"
        ));
        return true;
    }
}

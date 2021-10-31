package musementpark.offline.entertainment.visitor;

import musementpark.offline.entertainment.composite.Composite;
import musementpark.offline.entertainment.composite.Leaf;
import musementpark.util.Print;
import musementpark.util.PrintInfo;
/**
 * author：FanqingM
 * description：访问者模式，进行电量检查，与组合模式结合，访问整个组合模式树，两者是组合关系
 */
public class CheckElectricVisitor implements Visitor {
    /**
     * 访问中间节点，由于对于娱乐设施的组合模式树，这个没有意义，故不实现
     * @param composite
     */
    @Override
    public void visitComposite(Composite composite) {
    }

    /**
     * 访问叶子节点，检查电量
     * @param leaf
     */
    @Override
    public void visitLeaf(Leaf leaf) {
        Print.print(
                new PrintInfo(
                        "CheckElectricVisitor",
                        String.valueOf(System.identityHashCode(this)),
                        "visitLeaf",
                        "检查"+ leaf.getName()+"电量"
                )
        );
    }
}



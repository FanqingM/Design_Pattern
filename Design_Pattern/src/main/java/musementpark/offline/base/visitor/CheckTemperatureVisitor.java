package musementpark.offline.base.visitor;


import musementpark.offline.base.composite.Composite;
import musementpark.offline.base.composite.Leaf;

public class CheckTemperatureVisitor implements Visitor {

    @Override
    public void visitComposite(Composite composite) {
        System.out.println("检查温度" + composite.getName());
    }

    @Override
    public void visitLeaf(Leaf leaf) {
        System.out.println("检查温度" + leaf.getName());
    }
}


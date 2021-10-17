package musementpark.offline.base.security.visitor;


import musementpark.offline.base.security.composite.Composite;
import musementpark.offline.base.security.composite.Leaf;

public class CheckElectricVisitor implements Visitor {

    @Override
    public void visitComposite(Composite composite) {
        System.out.println("检查电量" + composite.getName());
    }

    @Override
    public void visitLeaf(Leaf leaf) {
        System.out.println("检查电量" + leaf.getName());
    }
}



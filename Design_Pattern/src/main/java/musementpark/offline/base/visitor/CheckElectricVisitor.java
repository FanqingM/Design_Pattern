package musementpark.offline.base.visitor;


import musementpark.offline.base.composite.Composite;
import musementpark.offline.base.composite.Leaf;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

public class CheckElectricVisitor implements Visitor {

    @Override
    public void visitComposite(Composite composite) {
//        Print.print(
//                new PrintInfo(
//                        "CheckElectricVisitor",
//                        String.valueOf(System.identityHashCode(this)),
//                        "visitComposite",
//                        "检查"+ composite.getName()+"电量"
//                )
//        );
    }

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



package musementpark.offline.base.visitor;


import musementpark.offline.entertainment.composite.Composite;
import musementpark.offline.entertainment.composite.Leaf;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

public class CheckTemperatureVisitor implements Visitor {

    @Override
    public void visitComposite(Composite composite) {
//        Print.print(
//                new PrintInfo(
//                        "CheckTemperatureVisitor",
//                        String.valueOf(System.identityHashCode(this)),
//                        "visitComposite",
//                        "检查" + composite.getName()+ "温度"
//                )
//        );
    }

    @Override
    public void visitLeaf(Leaf leaf) {
        Print.print(
                new PrintInfo(
                        "CheckTemperatureVisitor",
                        String.valueOf(System.identityHashCode(this)),
                        "visitLeaf",
                        "检查" + leaf.getName() + "温度"
                )
        );
    }
}



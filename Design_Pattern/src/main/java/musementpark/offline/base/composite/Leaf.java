package musementpark.offline.base.composite;

import musementpark.offline.base.visitor.Visitor;

/**
 * 叶子节点（相当于ConcreteElement）
 * @date 2016年2月29日
 */
public class Leaf extends Component {

    private String name;
//    public void execute() {
//
//    }
    public Leaf(String name) {
        super();
        super.name = name;
        this.name = name;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitLeaf(this);
    }

    public String getName() {
        return name;
    }

}

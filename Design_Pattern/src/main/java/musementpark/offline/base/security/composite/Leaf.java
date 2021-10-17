package musementpark.offline.base.security.composite;

import musementpark.offline.base.security.visitor.Visitor;

/**
 * 叶子节点（相当于ConcreteElement）
 * @date 2016年2月29日
 */
public class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        super();
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

package musementpark.offline.entertainment.composite;

import musementpark.offline.entertainment.visitor.Visitor;

/**
 * author：FanqingM
 * description：组合模式的叶子节点类
 */
public class Leaf extends Component {

    private String name;

    /**
     * 构造函数
     * @param name
     */
    public Leaf(String name) {
        super();
        super.name = name;
        this.name = name;
    }

    /**
     * 接受访问者访问
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitLeaf(this);
    }

    /**
     * 得到该节点的名字
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }
//    public String getName() {
//        return name;
//    }

}

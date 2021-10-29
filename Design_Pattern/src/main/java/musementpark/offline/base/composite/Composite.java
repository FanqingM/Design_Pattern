package musementpark.offline.base.composite;

import musementpark.offline.base.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * author：FanqingM
 * description：。。。。。。
 */
public class Composite extends Component {

    // 名字
    private String name;
    // 子节点的集合
    private List<Component> childComponents = new ArrayList<Component>();

    public Composite(String name) {
        super();
        super.name = name;
        this.name = name;
    }

    /**
     * 对于函数的功能描述
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitComposite(this);
        //循环子元素，让子元素也接受访问（子节点也要打印出来）
        for (Component c : childComponents) {
            c.accept(visitor);
        }
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void addChild(Component child) {
        childComponents.add(child);
    }

    @Override
    public void removeChild(Component child) {
        childComponents.remove(child);
    }

    @Override
    public Component getChildren(int index) {
        return childComponents.get(index);
    }

//    public String getName() {
//        return name;
//    }

}

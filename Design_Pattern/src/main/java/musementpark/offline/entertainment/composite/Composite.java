package musementpark.offline.entertainment.composite;

import musementpark.offline.entertainment.visitor.Visitor;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * author：FanqingM
 * description：组合模式的非叶子节点类
 */
public class Composite extends Component {

    // 名字
    private String name;
    // 子节点的集合
    private List<Component> childComponents = new ArrayList<Component>();

    /**
     * 构造函数
     * @param name
     */
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

    /**
     * 得到名字
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * 添加孩子节点
     * @param child
     */
    @Override
    public void addChild(Component child) {
        childComponents.add(child);
        Print.print(
                new PrintInfo(
                        "Composite",
                        String.valueOf(System.identityHashCode(this)),
                        "addChild",
                        this.getName() + "添加孩子" + child.getName()
                )
        );
    }

    /**
     * 移除孩子节点
     * @param child
     */
    @Override
    public void removeChild(Component child) {
        Print.print(
                new PrintInfo(
                        "Composite",
                        String.valueOf(System.identityHashCode(this)),
                        "removeChild",
                        this.getName() + "移除孩子" + child.getName()
                )
        );
        childComponents.remove(child);
    }

    /**
     * 得到指定汉字节点
     * @param index
     * @return Component
     */
    @Override
    public Component getChildren(int index) {
        return childComponents.get(index);
    }

}

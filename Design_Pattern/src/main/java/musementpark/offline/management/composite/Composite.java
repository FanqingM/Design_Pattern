package musementpark.offline.management.composite;


import musementpark.offline.management.chain.Bug;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * author：FanqingM
 * description：抽象的非叶子节点，将组合模式与责任链模式自然结合
 */
public class Composite extends Component {

    private int level;
    private Component parent;
    // 名字
    private String name;
    // 子节点的集合
    private List<Component> childComponents = new ArrayList<Component>();

    /**
     * 设置组合模式中的节点等级，决定了他能否处理一定难度的游客请求
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * 构造函数
     * @param name
     */
    public Composite(String name) {
        super();
        this.name = name;
    }

    /**
     * 解决用户请求
     * @param bug
     */
    private void solve(Bug bug) {
        Print.print(
                new PrintInfo(
                        "Component（Composite）",
                        String.valueOf(System.identityHashCode(this)),
                        "solve",
                        this.name + "解决了一个难度为 " + bug.value + " 的 bug"
                )
        );
    }

    /**
     * 处理用户请求
     * @param bug
     */
    @Override
    public void handle(Bug bug) {
        if (bug.value <= 20*level) {
            solve(bug);
        } else if (this.getParent() != null) {
            Print.print(
                    new PrintInfo(
                            "Component（Composite）",
                            String.valueOf(System.identityHashCode(this)),
                            "handle",
                            this.name + "无法解决了一个难度为 " + bug.value + " 的 bug，传给上级"
                    )
            );
            this.getParent().handle(bug);
        }
        else
        {
            Print.print(
                    new PrintInfo(
                            "Component（Composite）",
                            String.valueOf(System.identityHashCode(this)),
                            "handle",
                            this.name + "无法解决了一个难度为 " + bug.value +"，该bug无法解决"
                    )
            );
        }
    }

    /**
     * 无法处理，找父亲节点
     * @return
     */
    @Override
    public Component getParent() {
        return this.parent;
    }

    /**
     * 设置父亲节点
     * @param component
     */
    @Override
    public void setParent(Component component) {
        this.parent = component;
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

    public String getName() {
        return name;
    }
    @Override
    public void operation() {
        System.out.println(this.name + "的一些操作");
    }

}

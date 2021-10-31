package musementpark.offline.management.composite;


import musementpark.offline.management.chain.Bug;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author：FanqingM
 * description：抽象的叶子节点，将组合模式与责任链模式自然结合
 */
public class Leaf extends Component {

    private Component parent;
    private String name;

    /**
     * 构造函数
     * @param name
     */
    public Leaf(String name) {
        super();
        this.name = name;
    }

    /**
     * 处理不了问题，找父亲节点
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

    /**
     * 解决用户请求
     * @param bug
     */
    private void solve(Bug bug) {
        Print.print(
                new PrintInfo(
                        "Leaf（Composite）",
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
        if (bug.value <= 20) {
            solve(bug);
        } else if (this.getParent() != null) {
            Print.print(
                    new PrintInfo(
                            "Component（Leaf）",
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
                            "Component（Leaf）",
                            String.valueOf(System.identityHashCode(this)),
                            "handle",
                            this.name + "无法解决了一个难度为 " + bug.value +"，该bug无法解决"
                    )
            );
        }
    }
    public String getName() {
        return name;
    }
    @Override
    public void operation() {
        System.out.println(this.name + "的一些操作");
    }
}

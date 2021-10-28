package musementpark.offline.management.composite;


import musementpark.offline.management.chain.Bug;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * 叶子节点（相当于ConcreteElement）
 * @date 2016年2月29日
 */
public class Leaf extends Component {

    private Component parent;
    private String name;

    public Leaf(String name) {
        super();
        this.name = name;
    }
    @Override
    public Component getParent() {
        return this.parent;
    }
    @Override
    public void setParent(Component component) {
        this.parent = component;
    }
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

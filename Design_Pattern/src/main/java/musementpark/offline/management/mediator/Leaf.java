package musementpark.offline.management.mediator;


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
        super.name = name;
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
        System.out.println(this.name + "解决了一个难度为 " + bug.value + " 的 bug");
    }
    @Override
    public void handle(Bug bug) {
        if (bug.value <= 20) {
            solve(bug);
        } else if (this.getParent() != null) {
            this.getParent().handle(bug);
        }
    }

    public String getName() {
        return name;
    }
    @Override
    public void operation() {
        Print.print(
                new PrintInfo(
                        "Leaf(Component)",
                        String.valueOf(System.identityHashCode(this)),
                        "operation",
                        this.name + "进行一些操作"
                )
        );
    }
    public void notifyColleagueB() {
        mediator.notifyColleagueB();
    }
}

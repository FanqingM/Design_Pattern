package musementpark.offline.management.mediator;


import musementpark.offline.management.chain.Request;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author：FanqingM
 * description：组合模式叶子对象，这里与中介者模式连用，解决了组合模式树节点之间的交流问题
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
    private void solve(Request request) {
        System.out.println(this.name + "解决了一个难度为 " + request.value + " 的 bug");
    }
    @Override
    public void handle(Request request) {
        if (request.value <= 20) {
            solve(request);
        } else if (this.getParent() != null) {
            this.getParent().handle(request);
        }
    }

    public String getName() {
        return name;
    }

    /**
     * 为体现中介者模式，交流后进行的一些操作
     */
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

    /**
     * 向另一方发起交流
     */
    public void notifyColleagueB() {
        mediator.notifyColleagueB();
    }
}

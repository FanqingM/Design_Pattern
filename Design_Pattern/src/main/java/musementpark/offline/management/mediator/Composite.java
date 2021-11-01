package musementpark.offline.management.mediator;


import musementpark.offline.management.chain.Request;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * author：FanqingM
 * description：组合模式非叶子对象，这里与中介者模式连用，解决了组合模式树节点之间的交流问题
 */
public class Composite extends Component {

    private int level;
    private Component parent;
    // 名字
    private String name;
    // 子节点的集合
    private List<Component> childComponents = new ArrayList<Component>();

    public void setLevel(int level) {
        this.level = level;
    }

    public Composite(String name) {
        super();
        super.name = name;
        this.name = name;
    }
    private void solve(Request request) {
        System.out.println(this.name + "解决了一个难度为 " + request.value + " 的 bug");
    }
    @Override
    public void handle(Request request) {
        if (request.value <= 20*level) {
            solve(request);
        } else if (this.getParent() != null) {
            this.getParent().handle(request);
        }
    }
    @Override
    public Component getParent() {
        return this.parent;
    }
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

    /**
     * 为体现中介者模式，交流后需要进行的一些操作
     */
    @Override
    public void operation() {
        Print.print(
                new PrintInfo(
                        "Composite(Component)",
                        String.valueOf(System.identityHashCode(this)),
                        "operation",
                        this.name + "进行一些操作"
                )
        );
    }

    /**
     * 向另一个组合模式树中的节点发出通信请求
     */
    public void notifyColleagueA() {
        mediator.notifyColleagueA();
    }
}

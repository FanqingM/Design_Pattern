package musementpark.offline.management.people.composite;


import musementpark.offline.management.people.chain.Bug;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合节点（相当于ConcreteElement）
 * @date 2016年2月29日
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
        this.name = name;
    }
    private void solve(Bug bug) {
        System.out.println(this.name + "解决了一个难度为 " + bug.value + " 的 bug");
    }
    @Override
    public void handle(Bug bug) {
        if (bug.value <= 20*level) {
            solve(bug);
        } else if (this.getParent() != null) {
            this.getParent().handle(bug);
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
    @Override
    public void operation() {
        System.out.println(this.name + "的一些操作");
    }

}

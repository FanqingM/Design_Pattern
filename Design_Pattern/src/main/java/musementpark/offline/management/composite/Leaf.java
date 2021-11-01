package musementpark.offline.management.composite;


import musementpark.offline.management.chain.Request;
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
     * @param request
     */
    private void solve(Request request) {
        Print.print(
                new PrintInfo(
                        "Leaf（Composite）",
                        String.valueOf(System.identityHashCode(this)),
                        "solve",
                        this.name + "解决了一个难度为 " + request.value + " 的游客请求"
                )
        );
    }

    /**
     * 处理用户请求
     * @param request
     */
    @Override
    public void handle(Request request) {
        if (request.value <= 20) {
            solve(request);
        } else if (this.getParent() != null) {
            Print.print(
                    new PrintInfo(
                            "Component（Leaf）",
                            String.valueOf(System.identityHashCode(this)),
                            "handle",
                            this.name + "无法解决了一个难度为 " + request.value + " 的游客请求，传给上级"
                    )
            );
            this.getParent().handle(request);
        }
        else
        {
            Print.print(
                    new PrintInfo(
                            "Component（Leaf）",
                            String.valueOf(System.identityHashCode(this)),
                            "handle",
                            this.name + "无法解决了一个难度为 " + request.value +"，该游客请求暂时无法解决"
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

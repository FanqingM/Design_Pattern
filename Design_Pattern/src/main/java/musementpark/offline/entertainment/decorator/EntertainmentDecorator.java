package musementpark.offline.entertainment.decorator;
/**
 * author：FanqingM
 * description：娱乐设施的抽象装饰类，与先前的组合模式树结合，给某些对象增加功能
 */
import musementpark.offline.entertainment.composite.Component;
import musementpark.offline.entertainment.visitor.Visitor;

public abstract class EntertainmentDecorator extends Component {
    private Component component;
    public String name;

    /**
     * 构造函数
     * @param component
     */
    public EntertainmentDecorator(Component component) {
        this.component = component;
    }

    protected abstract void doSomething();
    /**
     * 接受访问
     * @param visitor
     */
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }


    /**
     * 添加子节点
     * @param child
     */
    public void addChild(Component child){
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }

    /**
     * 移除子节点
     * @param child
     */
    public void removeChild(Component child){
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }

    /**
     * 获取指定索引位置的子节点
     * @param index
     * @return
     */
    public Component getChildren(int index){
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }

    /**
     * 得到该节点名字
     * @return
     */
    @Override
    public String getName() {
        return this.component.getName();
    }

}


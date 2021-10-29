package musementpark.offline.entertainment.decorator;

import musementpark.offline.entertainment.composite.Component;
import musementpark.offline.entertainment.composite.Composite;
import musementpark.offline.entertainment.composite.Leaf;
import musementpark.offline.base.visitor.Visitor;

public abstract class EntertainmentDecorator extends Component {
    private Component component;
    public String name;
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
    @Override
    public String getName() {
        return this.component.getName();
    }

}


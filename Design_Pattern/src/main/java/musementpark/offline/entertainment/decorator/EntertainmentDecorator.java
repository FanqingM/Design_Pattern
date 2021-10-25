package musementpark.offline.entertainment.decorator;

import musementpark.offline.base.composite.Component;
import musementpark.offline.base.visitor.Visitor;

public abstract class EntertainmentDecorator extends Facility {
    private Facility aBattercake;
    public String name;
    public EntertainmentDecorator(Facility aBattercake) {
        this.aBattercake = aBattercake;
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
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }
    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }

}


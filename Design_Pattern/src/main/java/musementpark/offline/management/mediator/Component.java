package musementpark.offline.management.mediator;


import musementpark.offline.management.chain.Bug;

/**
 * 抽象的组件对象（相当于访问者模式中的Element）
 * @date 2016年2月29日
 */
public abstract class Component {
    protected Mediator mediator;
    public String name;
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void operation();
    public void setLevel(int level) {
    }
    public void handle(Bug bug) {
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }
    public Component getParent() {
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }
    public void setParent(Component component) {
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
}
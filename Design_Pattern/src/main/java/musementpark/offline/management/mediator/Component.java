package musementpark.offline.management.mediator;


import musementpark.offline.management.chain.Bug;

/**
 * author：FanqingM
 * description：抽象的组合模式组件对象，这里与中介者模式连用，解决了组合模式树节点之间的交流问题
 */
public abstract class Component {
    protected Mediator mediator;
    public String name;

    /**
     * 设置中介者
     * @param mediator
     */
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 进行一些交流过后需要进行的操作
     */
    public abstract void operation();
    /**
     * 设置节点等级
     * @param level
     */
    public void setLevel(int level) {
    }

    /**
     * 处理用户请求
     * @param bug
     */
    public void handle(Bug bug) {
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }

    /**
     * 获得父亲
     * @return
     */
    public Component getParent() {
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }

    /**
     * 设置父亲
     * @param component
     */
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
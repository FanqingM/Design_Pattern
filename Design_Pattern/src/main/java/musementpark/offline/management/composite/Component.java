package musementpark.offline.management.composite;


import musementpark.offline.management.chain.Bug;
/**
 * author：FanqingM
 * description：抽象的组件对象，将组合模式与责任链模式自然结合
 */
public abstract class Component {
    /**
     * 设置节点等级
     * @param level
     */
    public void setLevel(int level) {
    }
    public void operation() {
    }

    /**
     * 节点的处理用户请求函数
     * @param bug
     */
    public void handle(Bug bug) {
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }

    /**
     * 找父亲节点
     * @return
     */
    public Component getParent() {
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }

    /**
     * 设置父亲节点
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
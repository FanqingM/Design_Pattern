package musementpark.offline.base.security.composite;

import musementpark.offline.base.security.visitor.Visitor;

/**
 * 抽象的组件对象（相当于访问者模式中的Element）
 * @date 2016年2月29日
 */
public abstract class Component {

    public String name;
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
}
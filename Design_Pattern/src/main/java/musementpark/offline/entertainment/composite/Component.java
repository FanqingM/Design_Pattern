package musementpark.offline.entertainment.composite;

import musementpark.offline.entertainment.visitor.Visitor;
/**
 * author：FanqingM
 * description：抽象的组件对象，是用户访问的对象
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
     * 得到组件名字
     * @return
     */
    public String getName() {
        return this.name;
//        System.out.println(this.name);
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
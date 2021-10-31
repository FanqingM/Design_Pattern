package musementpark.offline.entertainment.visitor;

import musementpark.offline.entertainment.composite.Component;
/**
 * author：FanqingM
 * description：被访问者即组合模式树的节点（Component）的结构
 */
public class ObjectStructure {

    //对象结构
    private Component root;

    /**
     * 给组合模式的抽象类添加功能，处理访问请求
     * @param visitor
     */
    public void handleRequest(Visitor visitor) {
        if (root != null) {
            root.accept(visitor);
        }
    }

    /**
     * 设置根节点
     * @param root
     */
    public void setRoot(Component root) {
        this.root = root;

    }
}

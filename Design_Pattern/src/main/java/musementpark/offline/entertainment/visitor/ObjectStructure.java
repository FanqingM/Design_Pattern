package musementpark.offline.entertainment.visitor;

import musementpark.offline.entertainment.composite.Component;

public class ObjectStructure {

    //对象结构
    private Component root;

    /**
     * 添加功能
     *
     * @param visitor
     */
    public void handleRequest(Visitor visitor) {
        if (root != null) {
            root.accept(visitor);
        }
    }

    public void setRoot(Component root) {
        this.root = root;

    }
}

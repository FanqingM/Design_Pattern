package musementpark.offline.entertainment.composite;

/*
author: FanqingM
description: 组成成分类，叶子与非叶子都继承于此，对于客户端统一标识
 */

/**
 * 抽象的组件对象
 */
public class Component {
    private String name = "";
    public Component components[];

    public String getName() {
        return this.name;
//        System.out.println(this.name);
    }
    /**
     * 输出组件自身的名称
     */

    public void printStruct(String preStr) {
        ;
    }

    /**
     * 向组合对象中加入组件对象
     * @param child 被加入组合对象中的组件对象
     */
    public void addChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
    /**
     * 返回某个索引对应的组件对象
     * @param index 需要获取的组件对象的索引，索引从0开始
     * @return 索引对应的组件对象
     */
    public Component getChildren(int index) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}

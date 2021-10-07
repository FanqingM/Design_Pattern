package musementpark.offline.shoppingarea.suitstore.composite;

import java.util.ArrayList;
import java.util.Collection;

/*
author: FanqingM
description: 衣服分为男装，女装，男装下有男衣服，男裤子，男鞋，女装下有女衣服，女裤子，女鞋，这里上级对下级是包含关系
 */
/**
 * 抽象的组件对象
 */
public abstract class Component {
    /**
     * 输出组件自身的名称
     */
    public abstract void printStruct(String preStr);
    /**
     * 向组合对象中加入组件对象
     * @param child 被加入组合对象中的组件对象
     */
    public void addChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
    /**
     * 从组合对象中移出某个组件对象
     * @param child 被移出的组件对象
     */
    public void removeChild(Component child) {
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

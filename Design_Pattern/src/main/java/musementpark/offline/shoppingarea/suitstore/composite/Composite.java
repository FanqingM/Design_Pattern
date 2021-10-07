package musementpark.offline.shoppingarea.suitstore.composite;

import java.util.ArrayList;
import java.util.Collection;

/*
author: FanqingM
description: 衣服分为男装，女装，男装下有男衣服，男裤子，男鞋，女装下有女衣服，女裤子，女鞋，这里上级对下级是包含关系
 */
public class Composite {
    /**
     * 用来记录包含的其它组合对象
     */
    private Collection<Composite> childComposite = new ArrayList<Composite>();
    /**
     * 用来记录包含的其它叶子对象
     */
    private Collection<Leaf> childLeaf = new ArrayList<Leaf>();
    /**
     * 组合对象的名字
     */
    private String name = "";

    /**
     * 构造方法，传入组合对象的名字
     * @param name 组合对象的名字
     */
    public Composite(String name){
        this.name = name;
    }

    /**
     * 向组合对象加入被它包含的其它组合对象
     * @param c 被它包含的其它组合对象
     */
    public void addComposite(Composite c){
        this.childComposite.add(c);
    }
    /**
     * 向组合对象加入被它包含的叶子对象
     * @param leaf 被它包含的叶子对象
     */
    public void addLeaf(Leaf leaf){
        this.childLeaf.add(leaf);
    }
    /**
     * 输出组合对象自身的结构
     * @param preStr 前缀，主要是按照层级拼接的空格，实现向后缩进
     */
    public void printStruct(String preStr){
        //先把自己输出去
        System.out.println(preStr+"+"+this.name);
        //然后添加一个空格，表示向后缩进一个空格，输出自己包含的叶子对象
        preStr+=" ";
        for(Leaf leaf : childLeaf){
            leaf.printStruct(preStr);
        }
        //输出当前对象的子对象了
        for(Composite c : childComposite){
            //递归输出每个子对象
            c.printStruct(preStr);
        }
    }
}

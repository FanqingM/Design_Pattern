package musementpark.offline.entertainment.composite;

/*
author: FanqingM
description: 叶子对象
 */
public class Leaf extends Component {

    private String name = "";

    public Leaf(String name){
        this.name = name;
    }
//    public void printName() {
//        System.out.println(this.name);
//    }
    public String getName() {
        return this.name;
    //        System.out.println(this.name);
    }
    /**
     * 输出叶子对象的结构，叶子对象没有子对象，也就是输出叶子对象的名字
     * @param preStr 前缀，主要是按照层级拼接的空格，实现向后缩进
     */
    public void printStruct(String preStr){
        System.out.println(preStr+name);
    }
}

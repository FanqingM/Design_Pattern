package musementpark.offline.entertainment.iterator;

import org.junit.jupiter.api.Test;

import musementpark.offline.entertainment.composite.*;

class IteratorTest {
    @Test
    //对于客户端而言，操作的都是组件对象。
    public void suitListTest() {
        EntertainmentList entertainmentList = new EntertainmentList();
        //定义所有的组合对象
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        entertainmentList.components[entertainmentList.length++] = c1;
        Component c2 = new Composite("女装");
        entertainmentList.components[entertainmentList.length++] = c2;

        //定义所有的叶子对象
        Component leaf1 = new Leaf("衬衣");
        entertainmentList.components[entertainmentList.length++] = leaf1;
        Component leaf2 = new Leaf("夹克");
        entertainmentList.components[entertainmentList.length++] = leaf2;
        Component leaf3 = new Leaf("裙子");
        entertainmentList.components[entertainmentList.length++] = leaf3;
        Component leaf4 = new Leaf("套装");
        entertainmentList.components[entertainmentList.length++] = leaf4;

        //按照树的结构来组合组合对象和叶子对象
        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);
        //以上构造需要迭代器便利的数据结构
        //下面用迭代器进行遍历
        for(Iterator iter = entertainmentList.getIterator(); iter.hasNext();){
            Component c = (Component) iter.next();
            System.out.println(c.getName());
        }
    }
}
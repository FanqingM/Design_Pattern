package musementpark.offline.management.people.chain;

import musementpark.offline.management.people.composite.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainTest {
    @Test
    public void test() {
        //创建一个树状结构
        Component root = new Composite("总管理员");
        root.setParent(null);
        root.setLevel(3);
        Component c1 = new Composite("中级管理员");
        Component c2 = new Composite("中级管理员");
        c1.setLevel(2);
        c2.setLevel(2);
        root.addChild(c1);
        root.addChild(c2);
        c1.setParent(root);
        c2.setParent(root);
        Component lf1 = new Leaf("低级管理员");
        Component lf2 = new Leaf("低级管理员");
        c1.addChild(lf1);
        c1.addChild(lf2);
        lf1.setParent(c1);
        lf2.setParent(c1);
        Component lf3 = new Leaf("低级管理员");
        Component lf4 = new Leaf("低级管理员");
        lf1.setLevel(1);
        lf2.setLevel(1);
        lf3.setLevel(1);
        lf4.setLevel(1);
        c2.addChild(lf3);
        c2.addChild(lf4);
        lf3.setParent(c2);
        lf4.setParent(c2);

        Bug bug = new Bug(50);

        lf3.handle(bug);
    }

}
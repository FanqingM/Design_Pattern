package musementpark.offline.management.mediator;

import musementpark.offline.management.mediator.Component;
import musementpark.offline.management.mediator.Composite;
import musementpark.offline.management.mediator.Leaf;
import org.junit.jupiter.api.Test;

class MediatorTest {
    @Test
    public void MediatorTest() {
        Component root = new Composite("总管理部门");
        root.setParent(null);
        root.setLevel(3);
        Component c1 = new Composite("维修部门");
        Component c2 = new Composite("管理部门");
        c1.setLevel(2);
        c2.setLevel(2);
        root.addChild(c1);
        root.addChild(c2);
        c1.setParent(root);
        c2.setParent(root);
        Component lf1 = new Leaf("基础设施维修部门");
        Component lf2 = new Leaf("娱乐设施维修部门");
        c1.addChild(lf1);
        c1.addChild(lf2);
        lf1.setParent(c1);
        lf2.setParent(c1);
        Component lf3 = new Leaf("清洁工管理部门");
        Component lf4 = new Leaf("维修人员管理部门");
        lf1.setLevel(1);
        lf2.setLevel(1);
        lf3.setLevel(1);
        lf4.setLevel(1);
        c2.addChild(lf3);
        c2.addChild(lf4);
        lf3.setParent(c2);
        lf4.setParent(c2);

        //构造这两个对象的中介者
        Mediator mediator = new ConcreteMediator(lf1, lf2);
        lf1.setMediator(mediator);
        lf2.setMediator(mediator);

        lf1.mediator.notifyColleagueB();
        lf2.mediator.notifyColleagueA();
    }

}
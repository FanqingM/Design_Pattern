package musementpark.offline.management.mediator;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author：FanqingM
 * description：具体的中介者，即是哪几个对象的中介者
 */
public class ConcreteMediator extends Mediator{

    /**
     * 构造函数，与组合模式树结合，交流的双方都是树节点对象
     * @param colleagueA
     * @param colleagueB
     */
    public ConcreteMediator(Component colleagueA, Component colleagueB) {
        super(colleagueA, colleagueB);
    }

    /**
     * 一方向另一方发起交流
     */
    @Override
    public void notifyColleagueA() {
        if (colleagueA != null) {
            Print.print(
                    new PrintInfo(
                            "ConcreteMediator",
                            String.valueOf(System.identityHashCode(this)),
                            "notifyColleagueA",
                            colleagueB.name+ "联系" + colleagueA.name
                    )
            );
            colleagueA.operation();
        }
    }

    /**
     * 另一方向一方发起交流
     */
    @Override
    public void notifyColleagueB() {
        if (colleagueB != null) {
            Print.print(
                    new PrintInfo(
                            "ConcreteMediator",
                            String.valueOf(System.identityHashCode(this)),
                            "notifyColleagueB",
                            colleagueA.name+ "联系" + colleagueB.name
                    )
            );
            colleagueB.operation();
        }
    }
}

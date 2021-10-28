package musementpark.offline.management.mediator;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

// 中介者实现
public class ConcreteMediator extends Mediator{

    public ConcreteMediator(Component colleagueA, Component colleagueB) {
        super(colleagueA, colleagueB);
    }

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

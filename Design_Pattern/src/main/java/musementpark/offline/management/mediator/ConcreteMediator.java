package musementpark.offline.management.mediator;

// 中介者实现
public class ConcreteMediator extends Mediator{

    public ConcreteMediator(Component colleagueA, Component colleagueB) {
        super(colleagueA, colleagueB);
    }

    @Override
    public void notifyColleagueA() {
        if (colleagueA != null) {
            colleagueA.operation();
        }
    }

    @Override
    public void notifyColleagueB() {
        if (colleagueB != null) {
            colleagueB.operation();
        }
    }
}

package musementpark.offline.management.mediator;

// 抽象中介者
public abstract class Mediator {

    protected Component colleagueA;
    protected Component colleagueB;

    public Mediator(Component colleagueA, Component colleagueB) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }

    public abstract void notifyColleagueA();
    public abstract void notifyColleagueB();
}


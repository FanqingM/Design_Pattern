package musementpark.offline.management.mediator;

/**
 * author：FanqingM
 * description：抽象中介者
 */
public abstract class Mediator {

    protected Component colleagueA;
    protected Component colleagueB;

    /**
     * 构造中介者
     * @param colleagueA
     * @param colleagueB
     */
    public Mediator(Component colleagueA, Component colleagueB) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }

    /**
     * 向一方发起交流
     */
    public abstract void notifyColleagueA();

    /**
     * 向一方发起交流
     */
    public abstract void notifyColleagueB();
}


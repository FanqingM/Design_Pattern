package musementpark.offline.entertainment.decorator;

public class TimeDecorator extends EntertainmentDecorator {
    private Integer timeCost = 2;
    public TimeDecorator(Facility aBattercake) {
        super(aBattercake);
    }
    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加计时功能";
    }
    @Override
    protected int cost() {
        return super.cost() + this.timeCost;
    }
}


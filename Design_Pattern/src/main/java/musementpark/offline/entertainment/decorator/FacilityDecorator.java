package musementpark.offline.entertainment.decorator;

public abstract class FacilityDecorator extends Facility {
    private Facility aBattercake;

    public FacilityDecorator(Facility aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }
    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}


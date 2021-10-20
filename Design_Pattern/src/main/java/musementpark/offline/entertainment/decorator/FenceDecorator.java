package musementpark.offline.entertainment.decorator;

public class FenceDecorator extends EntertainmentDecorator {
    private Integer finceCost = 1;
    public FenceDecorator(Facility aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一边围栏";
    }

    @Override
    protected int cost() {
        return super.cost() + this.finceCost;
    }

    public void egg() {
        System.out.println("增加了一边围栏");
    }
}


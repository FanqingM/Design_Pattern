package musementpark.online.Bridge;

public class VIP2 extends Status {
    public static final int minConsumption = 200;

    @Override
    public double getDiscount() {
        return 0.8;
    }
}

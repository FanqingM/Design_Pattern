package musementpark.online.Bridge;

public class VIP1 extends Status {
    public static final int minConsumption = 100;

    @Override
    public double getDiscount() {
        return 0.9;
    }
}

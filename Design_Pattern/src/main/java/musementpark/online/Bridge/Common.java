package musementpark.online.Bridge;

public class Common extends Status {
    static {
        minConsumption = 0;
    }

    @Override
    public double getDiscount() {
        return 1;
    }
}

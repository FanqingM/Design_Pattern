package musementpark.offline.entertainment.decorator;

import musementpark.offline.entertainment.composite.Component;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

public class FenceDecorator extends EntertainmentDecorator {
    private Integer finceCost = 1;
    public FenceDecorator(Component component) {
        super(component);
        Print.print(
                new PrintInfo(
                        "FenceDecorator",
                        String.valueOf(System.identityHashCode(this)),
                        "FenceDecorator",
                        super.getName() + " 加一边围栏"
                )
        );
    }

    @Override
    protected void doSomething() {

    }

    @Override
    public String getName() {
        return super.getName() + " 加一边围栏";
    }


}


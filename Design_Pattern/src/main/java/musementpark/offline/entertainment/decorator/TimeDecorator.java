package musementpark.offline.entertainment.decorator;

import musementpark.offline.entertainment.composite.Component;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

public class TimeDecorator extends EntertainmentDecorator {
    private Integer timeCost = 2;
    public TimeDecorator(Component component) {
        super(component);
        Print.print(
                new PrintInfo(
                        "TimeDecorator",
                        String.valueOf(System.identityHashCode(this)),
                        "TimeDecorator",
                        super.getName() + " 加计时功能"
                )
        );
    }
    @Override
    protected void doSomething() {

    }

    @Override
    public String getName() {
        return super.getName() + " 加计时功能";
    }
}


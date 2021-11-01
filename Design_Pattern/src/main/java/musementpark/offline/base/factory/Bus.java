package musementpark.offline.base.factory;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

public class Bus implements Vehicle {

    @Override
    public void create() {
        Print.print(
                new PrintInfo(
                        "Bus",
                        String.valueOf(System.identityHashCode(this)),
                        "create",
                        "创建公交车"
                )
        );

    }
}

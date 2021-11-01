package musementpark.offline.base.factory;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

public class Bicycle implements Vehicle {

    @Override
    public void create() {
        Print.print(
                new PrintInfo(
                        "Bicycle",
                        String.valueOf(System.identityHashCode(this)),
                        "create",
                        "创建自行车"
                )
        );
    }

}

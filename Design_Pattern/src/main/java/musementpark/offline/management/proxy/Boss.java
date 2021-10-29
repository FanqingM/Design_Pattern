package musementpark.offline.management.proxy;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

public class Boss implements ReadFile {
    @Override
    public void read() {
        Print.print(
                new PrintInfo(
                        "Boss",
                        String.valueOf(System.identityHashCode(this)),
                        "read",
                        "我在读文件"
                )
        );
    }

}
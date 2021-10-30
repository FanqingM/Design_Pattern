package musementpark.offline.management.proxy;

import musementpark.util.Print;
import musementpark.util.PrintInfo;
/**
 * author：FanqingM
 * description：老板类
 */
public class Boss implements ReadFile {
    /**
     * 读文件操作
     */
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
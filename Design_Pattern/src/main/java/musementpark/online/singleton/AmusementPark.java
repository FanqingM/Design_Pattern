package musementpark.online.singleton;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author:PandaLYZ
 * description:该类是游乐场本身的大类，采用单例模式实现
 */
public class AmusementPark {
    private static final AmusementPark _singleton = new AmusementPark();
    private static final String _name="嘉年华游乐园";

    /**
     * description:私有构造函数
     */
    private AmusementPark(){};

    /**
     * description:提供给外界的接口，返回唯一实例
     * @return 返回唯一实例
     */
    public static AmusementPark getInstance(){
        Print.print(new PrintInfo(
                "AmusementPark",
                "static have no objectId",
                "getInstance",
                "获取游乐场类的唯一实例"
        ));
        return _singleton;
    }

    /**
     * description: 获取游乐场的名字
     * @return 返回游乐场的名字
     */
    public static String getName(){
        return _name;
    }


}

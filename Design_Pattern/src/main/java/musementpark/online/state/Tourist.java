package musementpark.online.state;

import musementpark.online.bridge.Status;
import musementpark.online.prototype.Visitor;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author: Yxxxb
 * description: 游客类 内部设置状态及其相关函数
 */
public class Tourist extends Visitor {
    private final SingleEntertainment _singleEntertainment;

    /**
     * 构造函数 传入单一娱乐设施对象
     *
     * @param name
     * @param singleEntertainment
     */
    public Tourist(String name, SingleEntertainment singleEntertainment) {
        _singleEntertainment = singleEntertainment;
        _status = getStatus(name);
        _status.getAuthority();
    }

    /**
     * 改变游客票务类型
     *
     * @param currentType
     * @param targetType
     */
    public void ChangeTouristType(String currentType, String targetType) {
        String outputInfo = "该游客类型已由" + currentType + "改变成" + targetType;
        Print.print(
                new PrintInfo(
                        "Tourist",
                        String.valueOf(System.identityHashCode(this)),
                        "ChangeTouristType",
                        outputInfo
                )
        );
        _status = getStatus(targetType);
        _status.getAuthority();
    }

    /**
     * 重写虚函数 无意义
     *
     * @return
     */
    public Visitor clone() {
        return this;
    }

    ;

    /**
     * 返回游客票价状态
     *
     * @return
     */
    public Status getStatus() {
        return _status;
    }

    ;

    /**
     * 含参 返回创建的状态实例
     *
     * @param name
     * @return
     */
    public Status getStatus(String name) {
        switch (name) {
            case "vip":
                return new Vip("vip", _singleEntertainment);
            case "normal":
                return new Normal("normal", _singleEntertainment);
            case "daytime":
                return new DayTime("daytime", _singleEntertainment);
            case "nighttime":
                return new NightTime("nighttime", _singleEntertainment);
            default:
                return this._status;
        }
    }

    ;


    /**
     * description: 判断是否为空类型的游客，供子类重写
     *
     * @return boolean
     */
    public boolean isNull() {
        return false;
    }

    ;
}

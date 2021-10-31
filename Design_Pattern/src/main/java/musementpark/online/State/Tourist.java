package musementpark.online.State;

import musementpark.online.Bridge.Status;
import musementpark.online.Prototype.Visitor;

/**
 * author: Yxxxb
 * description: 游客类 内部设置状态及其相关函数
 */
public class Tourist extends Visitor {
    //    private State _state;
//    private String _TouristType;
//
//    /*
//     * 构造函数
//     * @param 无
//     * */
//    public Tourist(){
//        _state = null;
//    }
//
//    /*
//     * 设置状态函数
//     * @param State
//     * */
//    public void set_state(State _state){
//        this._state = _state;
//    }
//
//    /*
//     * 获取状态
//     * @param State
//     * */
//    public State get_state(){
//        return _state;
//    }
    private final SingleEntertainment _singleEntertainment;

    public Tourist(String name, SingleEntertainment singleEntertainment) {
        _singleEntertainment = singleEntertainment;
        _status = getStatus(name);
    }

    public void ChangeTouristType(String currentType, String targetType) {
        System.out.println("该游客类型已由" + currentType + "改变成" + targetType);
        _status = getStatus(targetType);
    }

    public Visitor clone() {
        return this;
    }

    ;

    public Status getStatus() {
        return _status;
    }

    ;

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

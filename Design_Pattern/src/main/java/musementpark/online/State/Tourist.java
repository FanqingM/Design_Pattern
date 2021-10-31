package musementpark.online.State;

/**
 * author: Yxxxb
 * description: 游客类 内部设置状态及其相关函数
 */
public class Tourist {
    private State _state;
    private String _TouristType;

    /*
     * 构造函数
     * @param 无
     * */
    public Tourist(){
        _state = null;
    }

    /*
     * 设置状态函数
     * @param State
     * */
    public void set_state(State _state){
        this._state = _state;
    }

    /*
     * 获取状态
     * @param State
     * */
    public State get_state(){
        return _state;
    }
}

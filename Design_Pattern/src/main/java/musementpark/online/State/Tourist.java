package musementpark.online.State;

/**
 * @author: Yxxxb
 * @date: 2021/10/28 13:57
 * @description:
 */
public class Tourist {
    private State _state;
    private String _TouristType;

    public Tourist(){
        _state = null;
    }

    public void set_state(State _state){
        this._state = _state;
    }

    public State get_state(){
        return _state;
    }
}
